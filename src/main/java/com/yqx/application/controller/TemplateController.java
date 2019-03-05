package com.yqx.application.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqx.application.entity.Template;
import com.yqx.application.service.TemplateService;
import com.yqx.application.util.GetIDTool;
import com.yqx.application.vo.TemplateVO;

@RequestMapping("/Template")
@Controller
public class TemplateController {

	@Resource
	private TemplateService templateService;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@RequestMapping("/add")
	public void add(Template t) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			t.setId(GetIDTool.getUUID());
			templateService.add(t);
			jo.put("state", 0);
			jo.put("msg", "������Ϣ�ɹ�");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "������Ϣʧ��");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/deleteMore")
	public void deleteMore(String ids) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			templateService.deleteMore(Template.class, ids);
			jo.put("state", 0);
			jo.put("msg", "ɾ����Ϣ�ɹ�");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "ɾ����Ϣʧ��");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/update")
	public void update(Template t) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			templateService.update(t);
			jo.put("state", 0);
			jo.put("msg", "������Ϣ�ɹ�");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "������Ϣʧ��");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/queryById")
	@ResponseBody
	public Template queryById(int id,String page,Map<String,Object> map) {
		Template t = templateService.queryById(Template.class, id);
		map.put("page", page);
		map.put("Template", t);
		return t;
	}
	
	@RequestMapping("/queryByPage")
	public void queryByPage(String page) throws Exception {
		String rows = request.getParameter("rows");
		
		int sp = 1;
		int totals = templateService.getTotals(Template.class);
		int pageSize = Integer.parseInt(rows);
		int pageCounts = totals / pageSize;
		if(totals % pageSize !=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(page);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp > pageCounts) {
			sp = pageCounts;
		}
		if(sp < 1) {
			sp = 1;
		}
		List<TemplateVO> list = templateService.queryViewByPage(sp, pageSize);
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		jo.put("total", totals);
		jo.put("rows", list);
		String json = JSON.toJSONString(jo);
		out.write(json);
		out.flush();
		out.close();
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Template> queryAll(){
		List<Template> list = templateService.queryAll(Template.class);
		return list;
	}
	
	/*
	 * �������Ϊ���ڸ�ʽ
	 * */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
	            true));
	}
	
	@ModelAttribute
	public void setRequestAndResponse(HttpServletRequest request,HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.response.setContentType("text/html;charset=utf-8");
	}
}
