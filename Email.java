
public class Email 
{
  private String username, domain, extension;
  
  public Email()
  {
    username = null;
    domain = null;
    extension = null;
  }
  public Email(String username_, String domain_,String extension_)
  {
    username = username_;
    domain = domain_;
    extension = extension_;
  }
  public int getValue()
  {
      return 0;
    }
  public String toString()
  {
    String text = "";
    
    text = username + "@" + domain + "." + extension;
    
    return text;
}
