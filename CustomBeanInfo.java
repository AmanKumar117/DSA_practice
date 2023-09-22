import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class CustomBeanInfo {
    public static void main(String[] args) {
        try {
            // Get the BeanInfo for the CustomBean class
            BeanInfo beanInfo = Introspector.getBeanInfo(CustomBean.class);

            // Print the bean descriptor information
            System.out.println("Bean Descriptor:");
            System.out.println("Display Name: " + beanInfo.getBeanDescriptor().getDisplayName());
            System.out.println("Short Description: " + beanInfo.getBeanDescriptor().getShortDescription());
            System.out.println();

            // Print the property descriptors
            System.out.println("Property Descriptors:");
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                System.out.println("Property Name: " + descriptor.getName());
                System.out.println("Display Name: " + descriptor.getDisplayName());
                System.out.println("Short Description: " + descriptor.getShortDescription());
                System.out.println();
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
