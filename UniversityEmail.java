
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
    public void getCode()
    {
        
