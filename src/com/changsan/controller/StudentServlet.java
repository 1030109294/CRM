package com.changsan.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        if ("/student/add.do".equals(servletPath)){
            add(req , resp);
        }else if ("/student/update.do".equals(servletPath)){
            update(req , resp);
        }else if ("/student/delete.do".equals(servletPath)){
            delete(req , resp);
        }else if ("/student/insert.do".equals(servletPath)){
            insert(req , resp);
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("连接成功");
        System.out.println("添加操作开始执行");
    }
    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("连接成功");
        System.out.println("修改操作开始执行");
    }
    private void insert(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("连接成功");
        System.out.println("查询操作开始执行");
    }
    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("连接成功");
        System.out.println("删除操作开始执行");
    }
}
