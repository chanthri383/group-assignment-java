
public class UniversityEmail extends Email 
{
    private String department;
    private int code;
    
    public UniversityEmail()
    {
    department = null;
    code = 0;
    }
    
    public UniversityEmail(String username_, String domain_, String extension_,String department_,int code_)
    {
        super(username_,domain_,extension_);
        department = department_;
        code = code_;
    }   
    public void findCode()//assigns code based on department
    {
            String[] departments = {"","art","chee","chem","coe","cs","egr","polsci"};
            for (int x=0;x<9;x++)
            {
                    if (department==departments[x])
                    {
                            code=x;
                    }	
            }
    }	

    public int getCode()
    {
            return code;	
    }
}

        
