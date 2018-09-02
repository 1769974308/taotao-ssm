DAO层配置

1.spring-dao.xml
主要配置：数据库连接参数，连接池，SqlSessionFactory对象（mybatis），扫描dao层接口，动态实现dao接口 

2.jdbc.properties
主要配置：数据库连接，连接池参数

3.mybatis-config.xml
主要配置：配置mybatis全局属性

service层配置

1.spring-service.xml
主要配置：扫描service包所有注解 @Service；配置事务管理器，把事务管理交由spring来完成；
                         配置基于注解的声明式事务，可以直接在方法上@Transaction


web层配置
1.spring-web.xml
主要配置：开启SpringMVC注解模式，可以使用@RequestMapping，@PathVariable，@ResponseBody等；
                        对静态资源处理，如js，css，jpg等；配置jsp 显示ViewResolver；扫描web层 @Controller

                    
                        