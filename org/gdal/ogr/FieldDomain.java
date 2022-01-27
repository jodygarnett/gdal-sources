package org.gdal.ogr;

public class FieldDomain {
  private boolean swigCMemOwn;
  private long swigCPtr;

  public FieldDomain(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FieldDomain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_FieldDomain(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(FieldDomain obj) {
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
    if (obj instanceof FieldDomain)
      equal = (((FieldDomain)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String GetName() {
    return ogrJNI.FieldDomain_GetName(swigCPtr, this);
  }

  public String GetDescription() {
    return ogrJNI.FieldDomain_GetDescription(swigCPtr, this);
  }

  public int GetFieldType() {
    return ogrJNI.FieldDomain_GetFieldType(swigCPtr, this);
  }

  public int GetFieldSubType() {
    return ogrJNI.FieldDomain_GetFieldSubType(swigCPtr, this);
  }

  public int GetDomainType() {
    return ogrJNI.FieldDomain_GetDomainType(swigCPtr, this);
  }

  public int GetSplitPolicy() {
    return ogrJNI.FieldDomain_GetSplitPolicy(swigCPtr, this);
  }

  public void SetSplitPolicy(int policy) {
    ogrJNI.FieldDomain_SetSplitPolicy(swigCPtr, this, policy);
  }

  public int GetMergePolicy() {
    return ogrJNI.FieldDomain_GetMergePolicy(swigCPtr, this);
  }

  public void SetMergePolicy(int policy) {
    ogrJNI.FieldDomain_SetMergePolicy(swigCPtr, this, policy);
  }

  public double GetMinAsDouble() {
    return ogrJNI.FieldDomain_GetMinAsDouble(swigCPtr, this);
  }

  public boolean IsMinInclusive() {
    return ogrJNI.FieldDomain_IsMinInclusive(swigCPtr, this);
  }

  public double GetMaxAsDouble() {
    return ogrJNI.FieldDomain_GetMaxAsDouble(swigCPtr, this);
  }

  public boolean IsMaxInclusive() {
    return ogrJNI.FieldDomain_IsMaxInclusive(swigCPtr, this);
  }

  public String GetGlob() {
    return ogrJNI.FieldDomain_GetGlob(swigCPtr, this);
  }

}
