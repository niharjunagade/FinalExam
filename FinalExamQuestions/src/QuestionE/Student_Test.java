package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test1111() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
	}
		@Test
		public void Student_Test() {
			
			Date dBirthDate = null;
			try {
				dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1973-08-01");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Student stu2 = new Student("Calvin", "Cedric", "Cambridge", dBirthDate, "215 Labrador Lane", "302-993-6889", "ccambridge@udel.edu","MIS");
		}
			@Test
			public void Student_Test111() {
				
				Date dBirthDate = null;
				try {
					dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1974-09-02");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Student stu3 = new Student("Lesean", "Jimmy", "McCoy", dBirthDate, "216 Labrador Lane", "302-193-6889", "lmccoy@udel.edu","MIS");
			}
			@Test
			public void Student_Test11() {
				
				Date dBirthDate = null;
				try {
					dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1975-10-03");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Student stu4 = new Student("Randall", "Bert", "Cobb", dBirthDate, "217 Labrador Lane", "302-293-6889", "rcobb@udel.edu","MIS");
			}
			@Test
			public void Student_Test1() {
				
				Date dBirthDate = null;
				try {
					dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1976-11-04");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Student stu5 = new Student("Chip", "Gumbo", "Kelly", dBirthDate, "218 Labrador Lane", "302-393-6889", "ckelly@udel.edu","MIS");
			}

		assertTrue(1==1);
	}

}
