package org.gdal.gdal;

public class EDTComponent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EDTComponent(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EDTComponent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_EDTComponent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(EDTComponent obj) {
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
    if (obj instanceof EDTComponent)
      equal = (((EDTComponent)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public static EDTComponent Create(String name, long offset, ExtendedDataType type) {
    long cPtr = gdalJNI.EDTComponent_Create(name, offset, ExtendedDataType.getCPtr(type), type);
    return (cPtr == 0) ? null : new EDTComponent(cPtr, true);
  }

  public String GetName() {
    return gdalJNI.EDTComponent_GetName(swigCPtr, this);
  }

  public long GetOffset() {
    return gdalJNI.EDTComponent_GetOffset(swigCPtr, this);
  }

  public ExtendedDataType GetFieldType() {
    long cPtr = gdalJNI.EDTComponent_GetFieldType(swigCPtr, this);
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

}
