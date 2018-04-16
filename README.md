# Rong_Servlet
1、创建一个Dynamic web project
2、点击scr创建一个servlet，设置包名，servlet类名，选择需要的doGet和doPost方法。
3、在web.xml文件中配置servlet。如下
    <servlet>  
    <servlet-name>Servlet的名称（自己起的，不要重复）</servlet-name>  
       <servlet-class>Servlet的类路径（xx.xx.xx.xxservlet）</servlet-class>  
    </servlet>  
    <servlet-mapping>  
       <servlet-name>Servlet的名称（servlet映射与上面的一样）</servlet-name>  
       <url-pattern>/url名字（自己起的，不要重复，注意/，不能丢）</url-pattern>  
    </servlet-mapping>
