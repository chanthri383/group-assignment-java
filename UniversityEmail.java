
public class UniversityEmail extends Email 
{
    private String department;
    private int code;
    
    public UniversityEmail()
    {
    department = null;
    code = 0;
    }
    
    public UniversityEmail(String username_, String domain_, String extension_,String department_)
    {
        super(username_,domain_,extension_);
        department = department_;
        findCode();
    }   
    public void findCode()//assigns code based on department
    {
            String[] departments = {"","art","chee","chem","coe","cs","egr","polsci"};
            for (int x=0;x<8;x++)
            {
                    if (department.equals(departments[x]))
                    {
                            code=x;
                    }	
            }
    }	

    public int getCode()
    {
            return code;	
    }
    public String toString()
    {
        String text = "";
        
        text = super.toString().substring(0,indexOf('@')) + department + "." + super.toString().substring(indexOf('@' + 1) ;
        
        return text;
}

        
