
package pckgTest.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "add", namespace = "http://pckgTest/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", namespace = "http://pckgTest/", propOrder = {
    "i",
    "j"
})
public class Add {

    @XmlElement(name = "i", namespace = "")
    private int i;
    @XmlElement(name = "j", namespace = "")
    private int j;

    /**
     * 
     * @return
     *     returns int
     */
    public int getI() {
        return this.i;
    }

    /**
     * 
     * @param i
     *     the value for the i property
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getJ() {
        return this.j;
    }

    /**
     * 
     * @param j
     *     the value for the j property
     */
    public void setJ(int j) {
        this.j = j;
    }

}
