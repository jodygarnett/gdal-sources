package org.gdal.gdal;

public class ExtendedDataType {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ExtendedDataType(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtendedDataType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_ExtendedDataType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(ExtendedDataType obj) {
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
    if (obj instanceof ExtendedDataType)
      equal = (((ExtendedDataType)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public static ExtendedDataType Create(int dt) {
    long cPtr = gdalJNI.ExtendedDataType_Create(dt);
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

  public static ExtendedDataType CreateString(long nMaxStringLength) {
    long cPtr = gdalJNI.ExtendedDataType_CreateString__SWIG_0(nMaxStringLength);
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

  public static ExtendedDataType CreateString() {
    long cPtr = gdalJNI.ExtendedDataType_CreateString__SWIG_1();
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

  public String GetName() {
    return gdalJNI.ExtendedDataType_GetName(swigCPtr, this);
  }

  public ExtendedDataTypeClass GetClass() {
    return ExtendedDataTypeClass.swigToEnum(gdalJNI.ExtendedDataType_GetClass(swigCPtr, this));
  }

  public int GetNumericDataType() {
    return gdalJNI.ExtendedDataType_GetNumericDataType(swigCPtr, this);
  }

  public long GetSize() {
    return gdalJNI.ExtendedDataType_GetSize(swigCPtr, this);
  }

  public long GetMaxStringLength() {
    return gdalJNI.ExtendedDataType_GetMaxStringLength(swigCPtr, this);
  }

  public boolean CanConvertTo(ExtendedDataType other) {
    return gdalJNI.ExtendedDataType_CanConvertTo(swigCPtr, this, ExtendedDataType.getCPtr(other), other);
  }

  public boolean Equals(ExtendedDataType other) {
    return gdalJNI.ExtendedDataType_Equals(swigCPtr, this, ExtendedDataType.getCPtr(other), other);
  }

}
