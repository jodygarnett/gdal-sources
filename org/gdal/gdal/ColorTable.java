package org.gdal.gdal;

/* imports for getIndexColorModel */
import java.awt.image.IndexColorModel;
import java.awt.Color;

public class ColorTable implements Cloneable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ColorTable(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColorTable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_ColorTable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public Object clone()
  {
      return Clone();
  }

  // Convenience method.
  public IndexColorModel getIndexColorModel(int bits) {
    int size = GetCount();
    byte[] reds = new byte[size];
    byte[] greens = new byte[size];
    byte[] blues = new byte[size];
    byte[] alphas = new byte[size];
    int noAlphas = 0;
    int zeroAlphas = 0;
    int lastAlphaIndex = -1;

    Color entry = null;
    for(int i = 0; i < size; i++) {
      entry = GetColorEntry(i);
      reds[i] = (byte)(entry.getRed()&0xff);
      greens[i] = (byte)(entry.getGreen()&0xff);
      blues[i] = (byte)(entry.getBlue()&0xff);
      byte alpha = (byte)(entry.getAlpha()&0xff);

      // The byte type is -128 to 127 so a normal 255 will be -1.
      if (alpha == -1)
          noAlphas ++;
      else{
        if (alpha == 0){
           zeroAlphas++;
           lastAlphaIndex = i;
        }
      }
      alphas[i] = alpha;
    }
    if (noAlphas == size)
        return new IndexColorModel(bits, size, reds, greens, blues);
    else if (noAlphas == (size - 1) && zeroAlphas == 1)
        return new IndexColorModel(bits, size, reds, greens, blues, lastAlphaIndex);
    else
        return new IndexColorModel(bits, size, reds, greens, blues, alphas);
 }

  public ColorTable(int palette) {
    this(gdalJNI.new_ColorTable__SWIG_0(palette), true);
  }

  public ColorTable() {
    this(gdalJNI.new_ColorTable__SWIG_1(), true);
  }

  public ColorTable Clone() {
    long cPtr = gdalJNI.ColorTable_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ColorTable(cPtr, true);
  }

  public int GetPaletteInterpretation() {
    return gdalJNI.ColorTable_GetPaletteInterpretation(swigCPtr, this);
  }

  public int GetCount() {
    return gdalJNI.ColorTable_GetCount(swigCPtr, this);
  }

  public java.awt.Color GetColorEntry(int entry) {
    return gdalJNI.ColorTable_GetColorEntry(swigCPtr, this, entry);
  }

  public void SetColorEntry(int entry, java.awt.Color centry) {
    gdalJNI.ColorTable_SetColorEntry(swigCPtr, this, entry, centry);
  }

  public void CreateColorRamp(int nStartIndex, java.awt.Color startcolor, int nEndIndex, java.awt.Color endcolor) {
    gdalJNI.ColorTable_CreateColorRamp(swigCPtr, this, nStartIndex, startcolor, nEndIndex, endcolor);
  }

}
