import java.awt.*;

/** Interface to be implemented by all Barcodes */
public interface Barcode {

    /**
     * Sets scale of barcode relative to default size
     * @param s scale
     */
    void setScale(int s);

    /**
     * Returns the width of the generated barcode
     * @return width
     */
    public int getWidth();

    /**
     * Returns height of the generated barcode
     * @return heigth
     */
    public int getHeigth();

    /**
     * Returns contained content on the barcode
     * @return content
     */
    public String getContent();

    /**
     * Generates barcode
     * @return barcode the generated barcode
     */
    public Image generateCode();

    /**
     * Returns type of barcode
     * @return type
     */
    public String getName();

    /** get properties which are mandatory to be implemented
     * @return properties
     */
    public String[] mandatoryProperties();

}
