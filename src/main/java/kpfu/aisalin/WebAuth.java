package kpfu.aisalin;

import kpfu.aisalin.dao.*;
import kpfu.aisalin.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.WebApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
@ComponentScan(basePackages = "kpfu.aisalin")
public class WebAuth extends SpringBootServletInitializer {

        public static void main(String[] args) {
                ApplicationContext ctx = SpringApplication.run(WebAuth.class);
//
//                CompanyDAO companyDAO = ctx.getBean(CompanyDAO.class);
//                ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
//                UsersDAO usersDAO = ctx.getBean(UsersDAO.class);
//                MessageDAO messageDAO = ctx.getBean(MessageDAO.class);
//                AttachmentDAO attachmentDAO = ctx.getBean(AttachmentDAO.class);
//                TaskDAO taskDAO = ctx.getBean(TaskDAO.class);
//                UserInfDAO userInfDAO = ctx.getBean(UserInfDAO.class);
//                DateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
//                Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
//                List<Users> users = new ArrayList<Users>();
//                List<Company> companies = new ArrayList<Company>();
//                List<Project> projects = new ArrayList<Project>();
//                PasswordEncoder passwordEncoder =ctx.getBean(PasswordEncoder.class);
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
//                        Users user  = Users.builder()
//                                .login("login" + i)
//                                .password(passwordEncoder.encode("password" + i))
//                                .company(companies)
//                                .role("user")
//                                .build();
//                        users.add(user);
//
//                        UserInf userInf = UserInf.builder()
//                                .address("address" + i)
//                                .birthday(date)
//                                .fio("fio" + i)
//                                .gender(flag)
//                                .telNum("telNum" + i)
//                                .user(user)
//                                .build();
//
//                        companyDAO.save(company);
//                        projectDAO.save(project);
//                        usersDAO.save(user);
//                        userInfDAO.save(userInf);
//                }
//
//                for (int i = 1; i <= 10; i++) {
//                        int rand = 0 + (int) (Math.random() * 9);
//
//                        Task task = Task.builder()
//                                .deadline(date)
//                                .description("desc" + i)
//                                .taskName("taskName" + i)
//                                .ready(false)
//                                .project(projects.get(rand))
//                                .users(Arrays.asList(users.get(rand)))
//                                .build();
//
//                        Message message = Message.builder()
//                                .message("mes" + i)
//                                .date(date)
//                                .user(users.get(rand))
//                                .task(task)
//                                .build();
//
//                        Attachment attachment = Attachment.builder()
//                                .filePath("filePath" + i)
//                                .message(message)
//                                .build();
//
//                        taskDAO.save(task);
//                        messageDAO.save(message);
//                        attachmentDAO.save(attachment);
//                }
        }

        @Override
        protected WebApplicationContext run(SpringApplication application) {
                return super.run(application);
        }
}
