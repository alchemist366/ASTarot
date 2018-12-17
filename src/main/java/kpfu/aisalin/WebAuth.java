package kpfu.aisalin;

import kpfu.aisalin.dao.*;
import kpfu.aisalin.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.WebApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Main class that fills database with test data
 *
 * @author aisalin
 */
@SpringBootApplication
@ComponentScan(basePackages = "kpfu.aisalin")
public class WebAuth extends SpringBootServletInitializer {
        /**
         * main
         *
         * @param args
         */
        public static void main(String[] args) {
                ApplicationContext ctx = SpringApplication.run(WebAuth.class);

//                CompanyDAO companyDAO = ctx.getBean(CompanyDAO.class);
//                ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
//                UserDAO userDAO = ctx.getBean(UserDAO.class);
//                MessageDAO messageDAO = ctx.getBean(MessageDAO.class);
//                AttachmentDAO attachmentDAO = ctx.getBean(AttachmentDAO.class);
//                TaskDAO taskDAO = ctx.getBean(TaskDAO.class);
//                UserInfDAO userInfDAO = ctx.getBean(UserInfDAO.class);
//                DateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
//                Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
//                List<Users> users = new ArrayList<Users>();
//                List<Company> companies = new ArrayList<Company>();
//                List<Project> projects = new ArrayList<Project>();
//                List<Task> tasks = new ArrayList<Task>();
//                PasswordEncoder passwordEncoder = ctx.getBean(PasswordEncoder.class);
//                boolean flag = false;
//
//
//                for (int i = 1; i <= 10; i++) {
//
//                        Company company = Company.builder()
//                                .address("comAddress" + i)
//                                .comName("comName" + i)
//                                .employeesCount(i)
//                                .telNum("telNum" + i)
//                                .build();
//                        companies.add(company);
//
//                        Project project = Project.builder()
//                                .creationDate(date)
//                                .deadline(date)
//                                .projectName("project" + i)
//                                .companies(companies)
//                                .ready(flag)
//                                .build();
//                        projects.add(project);
//
//                        Task task = Task.builder()
//                                .deadline(date)
//                                .description("desc" + i)
//                                .taskName("taskName" + i)
//                                .ready(false)
//                                .project(project)
//                                .build();
//                        tasks.add(task);
//
//
//                        UserInf userInf = UserInf.builder()
//                                .address("address" + i)
//                                .fio("fio" + i)
//                                .telNum("telNum" + i)
//                                .build();
//                        userInfDAO.save(userInf);
//                        Users user = Users.builder()
//                                .login("login" + i)
//                                .password(passwordEncoder.encode("password" + i))
//                                .companies(companies)
//                                .tasks(tasks)
//                                .role("users")
//                                .workedHours(100)
//                                .img("http://www.newlifefamilychiropractic.net/wp-content/uploads/2014/07/300x300.gif")
//                                .userInf(userInf)
//                                .build();
//                        users.add(user);
//
//                        companyDAO.save(company);
//                        projectDAO.save(project);
//                        taskDAO.save(task);
//                        userDAO.save(users);
//
//                }
//
//                for (int i = 1; i <= 10; i++) {
//                        int rand = 0 + (int) (Math.random() * 9);
//
//
//                        Message message = Message.builder()
//                                .message("mes" + i)
//                                .date(date)
//                                .users(users.get(rand))
//                                .task(tasks.get(rand))
//                                .build();
//
//                        Attachment attachment = Attachment.builder()
//                                .filePath("filePath" + i)
//                                .message(message)
//                                .build();
//
//
//                        messageDAO.save(message);
//                        attachmentDAO.save(attachment);
//                }
        }

        /**
         * Overraided method to run client-server application
         * @param application
         * @return WebApplicationContext
         */
        @Override
        protected WebApplicationContext run(SpringApplication application) {
                return super.run(application);
        }
}
