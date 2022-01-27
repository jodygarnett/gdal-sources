package org.gdal.gdal;

public class Attribute {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Attribute(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Attribute obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Attribute(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Attribute obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Attribute)
      equal = (((Attribute)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String GetName() {
    return gdalJNI.Attribute_GetName(swigCPtr, this);
  }

  public String GetFullName() {
    return gdalJNI.Attribute_GetFullName(swigCPtr, this);
  }

  public java.math.BigInteger GetTotalElementsCount() {
    return gdalJNI.Attribute_GetTotalElementsCount(swigCPtr, this);
  }

  public long GetDimensionCount() {
    return gdalJNI.Attribute_GetDimensionCount(swigCPtr, this);
  }

  public ExtendedDataType GetDataType() {
    long cPtr = gdalJNI.Attribute_GetDataType(swigCPtr, this);
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

  public String ReadAsString() {
    return gdalJNI.Attribute_ReadAsString(swigCPtr, this);
  }

  public int ReadAsInt() {
    return gdalJNI.Attribute_ReadAsInt(swigCPtr, this);
  }

  public double ReadAsDouble() {
    return gdalJNI.Attribute_ReadAsDouble(swigCPtr, this);
  }

  public java.util.Vector ReadAsStringArray() {
    return gdalJNI.Attribute_ReadAsStringArray(swigCPtr, this);
  }

  public int WriteString(String val) {
    return gdalJNI.Attribute_WriteString(swigCPtr, this, val);
  }

  public int WriteStringArray(java.util.Vector vals) {
    return gdalJNI.Attribute_WriteStringArray(swigCPtr, this, vals);
  }

  public int WriteInt(int val) {
    return gdalJNI.Attribute_WriteInt(swigCPtr, this, val);
  }

  public int WriteDouble(double val) {
    return gdalJNI.Attribute_WriteDouble(swigCPtr, this, val);
  }

}
