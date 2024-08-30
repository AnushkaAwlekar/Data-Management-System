import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import java.util.*;
class DesignationManagerDesignationTitleExistsTestCase{
public static void main(String gg[]){
String title=gg[0];
try{
DesignationManagerInterface designationManager;
designationManager=DesignationManager.getDesignationManager();
System.out.printf(title + " exists: "+designationManager.designationTitleExists(title));
}catch(BLException ble){
List<String> properties=ble.getProperties();
for(String property: properties){
System.out.println(ble.getException(property));
}
}
}
}
