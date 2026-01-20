package com.ts.RESTAPI_Q2L;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.ts.dto.Credits;
import com.ts.dao.CreditsDAO;
import com.ts.dao.MaterialDetailsDAO;
import com.ts.dao.MentorDAO;
import com.ts.dao.QuizDAO;
import com.ts.dao.QuizSubDAO;
/*import com.rest.dto.Department;
import com.rest.dto.Employee;
import com.ts.dao.DeptDAO;
import com.ts.dao.EmployeeDAO;*/
/*import com.ts.dto.Employee;
import com.ts.dao.EmployeeDAO;
import com.rest.dto.Department;
import com.rest.dto.Employee;
import com.ts.dao.DeptDAO;
import com.ts.dao.EmployeeDAO;*/
import com.ts.dao.StudentDAO;
import com.ts.dao.SubjectDAO;
//import com.ts.dto.ItemDetails;
import com.ts.dto.Material;
import com.ts.dto.MaterialDetails;
import com.ts.dto.Mentor;
import com.ts.dto.Quiz;
import com.ts.dto.QuizSub;
import com.ts.dto.Student;
import com.ts.dto.Subject;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    

	@Path("registerStudent")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerStudent(Student student) {
		System.out.println("Data Recieved in Student Register : " + student);
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.register(student);
	
	}
	
	@Path("registerMentor")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerMentor(Mentor mentor) {
		System.out.println("Data Recieved in Mentor Register : " + mentor);
		MentorDAO mentorDAO = new MentorDAO();
		mentorDAO.register(mentor);
	
	}
	
	@Path("getAllStudents")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents() {
		StudentDAO studentDAO = new StudentDAO();
		List<Student> studentList = studentDAO.getAllStudents();
		return studentList;
	}
	
	@Path("getAllMentors")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mentor> getAllMentorss() {
		MentorDAO mentorDAO = new MentorDAO();
		List<Mentor> mentorList = mentorDAO.getAllMentors();
		return mentorList;
	}
	@Path("getAllSubjects")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubjects() {
		SubjectDAO subjectDAO = new SubjectDAO();
		List<Subject> subjectList = subjectDAO.getAllSubjects();
		return subjectList;
	}
	@Path("getAllQuiz/{subjectName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<QuizSub> getAllQuiz(@PathParam("subjectName") String subjectName) {
		QuizSubDAO quizsubDAO = new QuizSubDAO();
		List<QuizSub> quizsubList = quizsubDAO.getAllQuiz(subjectName);
		return quizsubList;
	}
	
	@Path("getAllQues/{quizName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Quiz> getAllQues(@PathParam("quizName") String quizName) {
		System.out.println("Recieved path params in getallques: "+quizName+" "); 
		QuizDAO quizDao = new QuizDAO();
		List<Quiz> quesSet = quizDao.getAllQues(quizName);
		return quesSet;
	}
	
	
	
    @Path("getStudentByEmail/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentByEmail(@PathParam("email") String email) {
		System.out.println("Recieved path params: "+email); 
		StudentDAO studentDAO = new StudentDAO();
		Student student = studentDAO.getStudentByEmail(email);
		return student;
	}

	@Path("getStudentByUserPass/{emailId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentByUserPass(@PathParam("emailId") String emailId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+emailId+" "+password); 
		StudentDAO studentDAO = new StudentDAO();
		Student student = studentDAO.getStudentByUserPass(emailId, password);
		return student;
	}
	
	@Path("getMentorByUserPass/{emailId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mentor getMentorByUserPass(@PathParam("emailId") String emailId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+emailId+" "+password); 
		MentorDAO mentorDAO = new MentorDAO();
		Mentor mentor = mentorDAO.getMentorByUserPass(emailId, password);
		return mentor;
	}
	
	


	@Path("getStudents")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {

		StudentDAO studentDAO = new StudentDAO();
		List <Student> studentList = studentDAO.getAllStudents();

		return studentList;
	}
	
	
	
	
	@Path("getAllSubjectsForStu/{studentId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubjectsForStu(@PathParam("studentId") int studentId) {
		System.out.println("Recieved path params in pat: "+studentId); 
		SubjectDAO subjectDao = new SubjectDAO();
		List <Subject> subjectsList = subjectDao.getAllSubjectsForStu(studentId);
		return subjectsList;
	}
	    
	
	@Path("getMentors")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mentor> getMentors() {

		MentorDAO mentorDAO = new MentorDAO();
		List <Mentor> mentorList = mentorDAO.getAllMentors();

		return mentorList;
	}
	

	//It is sample code if need to test and insert values into any tables
	@Path("registerStudent1")
	@GET
	public String registerStudent1() {
		Student student = new Student(); 
		
		student.setStudentFirstName("Reshma");
		student.setStudentLastName("Pamarthi");
		student.setEmailId("Resh123@gmail.com");
		student.setPassword("Reshma");
		student.setInstitution("VVJC");
		student.setStandard("11th");
		
		System.out.println(student);
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.register(student);
		
		return "Success";	
	
	}
	
	@Path("uploadMaterial")
    @POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public void uploadMaterial(@FormDataParam("imageName") InputStream fileInputStream,@FormDataParam("imageName") FormDataContentDisposition
	formDataContentDisposition, @FormDataParam("materialName") String materialName , @FormDataParam("materialDescription") String materialDescription) throws IOException {; 
		int read = 0;
		byte[] bytes = new byte[1024];
		System.out.println("upload");
		String path = "C:\\Users\\P.Reshma Rani\\Desktop\\VVJC\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\RESTAPI_Q2L";
		String pathArr[] = path.split("/WEB-INF/classes/");
		System.out.println(path);
		//System.out.println(pathArr[0]);
		FileOutputStream out = new FileOutputStream(new File(pathArr[0]+"/image/", formDataContentDisposition.getFileName()));
		System.out.println(pathArr[0]);		
				
		while((read = fileInputStream.read(bytes)) != -1){	
			
			out.write(bytes,0,read);
		}
		out.flush();
		out.close();
		
		
		MaterialDetails materialDetails = new MaterialDetails();
		
		materialDetails.setMaterialName(materialName);
		materialDetails.setMaterialDescription(materialDescription);
		materialDetails.setImageName(formDataContentDisposition.getFileName());
		MaterialDetailsDAO materialDetailsDAO = new MaterialDetailsDAO();
		materialDetailsDAO.addmaterial(materialDetails);
		
	}
	
	@Path("getMaterials")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<MaterialDetails> getProducts() {

		MaterialDetailsDAO materialDetailsDAO  = new MaterialDetailsDAO ();
		List <MaterialDetails> materialDetailsList = materialDetailsDAO.getAllMaterialDetails();

		return materialDetailsList;
	}
	
	@Path("mail")
    @POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
   public String mail(@FormDataParam("studentFirstName") String studentFirstName,@FormDataParam("studentLastName") String studentLastName,@FormDataParam("institution") String institution,@FormDataParam("emailId") String emailId) throws MessagingException {
 
       String subject="You have registered as: "+" "+ studentFirstName +" "+studentLastName;
       String body="Welcome to EduLearn"+" "+ studentFirstName +" "+ studentLastName +" "+"from"+" "+ institution;
       String email=emailId;
       String host = "smtp.gmail.com";
       String from = "edulearnhub@gmail.com";
       String pass = "EduLearn@2";
       System.out.println(emailId+"Received in mail");
       Properties props = System.getProperties();
    
       props.put("mail.smtp.starttls.enable", "true"); // added this line
       props.put("mail.smtp.host", host);
       props.put("mail.smtp.user", from);
       props.put("mail.smtp.password", pass);
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.auth", "true");
    
       String[] to = {emailId}; // added this line
    
       Session session = Session.getDefaultInstance(props, null);
       MimeMessage message = new MimeMessage(session);
       message.setFrom(new InternetAddress(from));

       InternetAddress[] toAddress = new InternetAddress[to.length];

       // To get the array of addresses

       for( int i=0; i < to.length; i++ ) {
	       toAddress[i] = new InternetAddress(to[i]);
       }
   
       for( int i=0; i < toAddress.length; i++) {
           // changed from a while loop
           message.addRecipient(Message.RecipientType.TO, toAddress[i]);
       }
   
       message.setSubject(subject);
       message.setText(body);

       Transport transport = session.getTransport("smtp");

       transport.connect(host, from, pass);
       transport.sendMessage(message, message.getAllRecipients());

       transport.close();

       return "Successful";
	}
	
	
	@Path("mailForMentor")
    @POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
   public String mailForMentor(@FormDataParam("mentorFirstName") String mentorFirstName,@FormDataParam("mentorLastName") String mentorLastName,@FormDataParam("qualification") String qualification,@FormDataParam("emailId") String emailId) throws MessagingException {
 
       String subject="You have registered as: "+" "+ mentorFirstName +" "+mentorLastName;
       String body="Welcome to EduLearn"+" "+ "Mr/Mrs" + " "+ mentorFirstName +" "+ mentorLastName +"("+qualification+")";
       String email=emailId;
       String host = "smtp.gmail.com";
       String from = "edulearnhub@gmail.com";
       String pass = "EduLearn@2";
       System.out.println(emailId+"Received in mail");
       Properties props = System.getProperties();
    
       props.put("mail.smtp.starttls.enable", "true"); // added this line
       props.put("mail.smtp.host", host);
       props.put("mail.smtp.user", from);
       props.put("mail.smtp.password", pass);
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.auth", "true");
    
       String[] to = {emailId}; // added this line
    
       Session session = Session.getDefaultInstance(props, null);
       MimeMessage message = new MimeMessage(session);
       message.setFrom(new InternetAddress(from));

       InternetAddress[] toAddress = new InternetAddress[to.length];

       // To get the array of addresses

       for( int i=0; i < to.length; i++ ) {
	       toAddress[i] = new InternetAddress(to[i]);
       }
   
       for( int i=0; i < toAddress.length; i++) {
           // changed from a while loop
           message.addRecipient(Message.RecipientType.TO, toAddress[i]);
       }
   
       message.setSubject(subject);
       message.setText(body);

       Transport transport = session.getTransport("smtp");

       transport.connect(host, from, pass);
       transport.sendMessage(message, message.getAllRecipients());

       transport.close();

       return "Successful";
	}
	
	@Path("mailForResult")
    @POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
   public String mailForResult(@FormDataParam("quizName") String quizName,@FormDataParam("marks") String marks,@FormDataParam("total") String total,@FormDataParam("emailId") String emailId) throws MessagingException {

	String subject="You have successfuly submitted the quiz: "+ quizName;
       String body="You have scored "+marks+" points out of "+total+" points in the quiz "+quizName;
       String email=emailId;
       String host = "smtp.gmail.com";
       String from = "edulearnhub@gmail.com";
       String pass = "EduLearn@2";
       System.out.println(emailId+"Received in mail");
       System.out.println(marks+"Received in mail");
       System.out.println(total+"Received in mail");
       System.out.println(quizName+"Received in mail");
       Properties props = System.getProperties();
       

    
       props.put("mail.smtp.starttls.enable", "true"); // added this line
       props.put("mail.smtp.host", host);
       props.put("mail.smtp.user", from);
       props.put("mail.smtp.password", pass);
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.auth", "true");
    
       String[] to = {email}; // added this line
    
       Session session = Session.getDefaultInstance(props, null);
       MimeMessage message = new MimeMessage(session);
       message.setFrom(new InternetAddress(from));

       InternetAddress[] toAddress = new InternetAddress[to.length];

       // To get the array of addresses

       for( int i=0; i < to.length; i++ ) {
	       toAddress[i] = new InternetAddress(to[i]);
       }
   
       for( int i=0; i < toAddress.length; i++) {
           // changed from a while loop
           message.addRecipient(Message.RecipientType.TO, toAddress[i]);
       }
   
       message.setSubject(subject);
       message.setText(body);

       Transport transport = session.getTransport("smtp");

       transport.connect(host, from, pass);
       transport.sendMessage(message, message.getAllRecipients());

       transport.close();

       return "Successful";


   }
    
	
	@Path("registerQuiz")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public int registerQuiz(Quiz quiz) {
		System.out.println("Data Recieved in quiz register : " + quiz);
		QuizDAO quizDao = new QuizDAO();
		int p=quizDao.register(quiz);
		return p;
	}
	
	@Path("registerQs")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public int registerQs(QuizSub quizsub) {
		System.out.println("Data Recieved in quizsub register : " + quizsub);
		QuizSubDAO quizsubDao = new QuizSubDAO();
		int p=quizsubDao.register(quizsub);
		return p;
	}
	
	@Path("registerQuiz1")
	@GET
	public String registeQuiz1() {
		Quiz quiz = new Quiz(); 
		
		quiz.setQuizName("Quiz1");
		quiz.setQuestionDes("what is the square of 16?");
		quiz.setOptiona_1("245");
		quiz.setOptionb_2("256");
		quiz.setOptionc_3("356"); 
		quiz.setOptiond_4("435");
		quiz.setCorrectAns("256");
		
		System.out.println(quiz);
		QuizDAO quizDAO = new QuizDAO();
		quizDAO.register(quiz);
		
		return "Success";	
	
	}
	
	@Path("registerQs1")
	@GET
	public String registeQs1() {
		QuizSub quizsub = new QuizSub(); 
		
		quizsub.setQuizName1("Quiz2");
		quizsub.setSubjectName1("Maths");
		
		System.out.println(quizsub);
		QuizSubDAO quizsubDAO = new QuizSubDAO();
		quizsubDAO.register(quizsub);
		
		return "Success";	
	
	}
	
	
	
	@Path("storeCredits")
    @POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public int storeCredits(@FormDataParam("subjectId") int subjectId,@FormDataParam("studentId") int studentId,@FormDataParam("marks") int marks) throws IOException {
    	Credits credit = new Credits();
    	credit.setSubjectId(subjectId);
    	credit.setStudentId(studentId);
    	credit.setMarks(marks);
    	CreditsDAO creditsDao = new CreditsDAO();
    	return creditsDao.register(credit);
    	
    }
   
	/*@Path("mail")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() throws MessagingException {
		String subject="Test Mail";
		String body="Java mail test...";
		String email="Reshcreates@gmail.com";
		String host = "smtp.gmail.com";
		String from = "tejasree@gmail.com";
		String pass = "TejaSree@24";

		Properties props = System.getProperties();

		props.put("mail.smtp.starttls.enable", "true"); // added this line
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", pass);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");

		String[] to = {email}; // added this line

		Session session = Session.getDefaultInstance(props, null);
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));

		InternetAddress[] toAddress = new InternetAddress[to.length];

		// To get the array of addresses

		for( int i=0; i < to.length; i++ )
		{
			// changed from a while loop
			toAddress[i] = new InternetAddress(to[i]);
		}

		for( int i=0; i < toAddress.length; i++)
		{
			// changed from a while loop
			message.addRecipient(Message.RecipientType.TO, toAddress[i]);
		}

		message.setSubject(subject);
		message.setText(body);

		Transport transport = session.getTransport("smtp");

		transport.connect(host, from, pass);
		transport.sendMessage(message, message.getAllRecipients());

		transport.close();

		return "Successful";
	}*/


   
	@Path("registerMentor1")
	@GET
	public String registerMentor1() {
		Mentor mentor = new Mentor(); 
		
		mentor.setMentorFirstName("Reshma");
		mentor.setMentorLastName("Pamarthi");
		mentor.setPassword("reshmap");
		mentor.setEmailId("resh123@gmail.com");
		mentor.setPhoneNo("8535545654");
		mentor.setQualification("M.A");
		mentor.setProfession("Lecturer");
		
		System.out.println(mentor);
		MentorDAO mentorDAO = new MentorDAO();
		mentorDAO.register(mentor);
		
		return "Success";	
	
	}
	
	
	/*@Path("registerDept")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerDept(Department department) {
		System.out.println("Data Recieved in Dept Register : "+department); 
		DeptDAO deptDao = new DeptDAO();
		deptDao.register(department);
	}*/
	
	/*@Path("getDepartments")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getDepartments() {        
		DeptDAO deptDao = new DeptDAO();
		List <Department> deptList = deptDao.getAllDepts();
		return deptList;
	}*/

	/*@Path("getDeptByName/{deptName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getDeptByName(@PathParam("deptName") String deptName) {        
		System.out.println(deptName);      
		DeptDAO deptDao = new DeptDAO();
		List<Department> depts = deptDao.getDeptByName(deptName);
		System.out.println(depts); 
		return depts;
	}*/
}
	


