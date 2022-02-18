package comp.hasahmap.equal.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class HashAndEqualMethodOverdie {
    public static void main(String[] args) {
	Student s= new Student("123hitk");
	Student s1= new Student("123hitk");
	System.out.println(s.equals(s1));
	
	
	Map<Student, ReportCard> stuReport= new HashMap<>();
	stuReport.put(s1, new ReportCard());
	stuReport.put(s, new ReportCard());
	System.out.println(stuReport.size());
	for (Student string : stuReport.keySet()) {
	    //System.out.println(string.getRegNum().toString()+"------------key---------valuw"+string.getRegNum());
	    
	}
	for (ReportCard string : stuReport.values()) {
	    //  System.out.println(string.getMathMark()+"------------key---------Makrks "+string.getMathMark());
	    
	}
	for(Map.Entry<Student, ReportCard> report:stuReport.entrySet()) {
	    
	   // System.out.println(report.getKey().getRegNum()+"-----"+report.getValue().getMathMark());
	    
	    
	}
	
	
	stuReport.forEach((Student,ReportCard) -> System.out.println(Student.getRegNum() + " = " + ReportCard.getMathMark()));
	
	
	
	
	
	 Set<Student> students= new HashSet<Student>();
		   for(int i=0; i<100; i++) {
		       students.add(new Student("H"+i));
		 }
		   
		   long startTime=System.nanoTime();
		   students.contains("H4");
		   System.out.println("Findingtime:"+(System.nanoTime()-startTime));
    }
    
  
   
   
   
    
    
    
    

}
