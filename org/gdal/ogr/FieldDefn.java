package org.gdal.ogr;

public class FieldDefn {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FieldDefn(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FieldDefn obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_FieldDefn(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(FieldDefn obj) {
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
    if (obj instanceof FieldDefn)
      equal = (((FieldDefn)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public FieldDefn(String name_null_ok, int field_type) {
    this(ogrJNI.new_FieldDefn__SWIG_0(name_null_ok, field_type), true);
  }

  public FieldDefn(String name_null_ok) {
    this(ogrJNI.new_FieldDefn__SWIG_1(name_null_ok), true);
  }

  public FieldDefn() {
    this(ogrJNI.new_FieldDefn__SWIG_2(), true);
  }

  public String GetName() {
    return ogrJNI.FieldDefn_GetName(swigCPtr, this);
  }

  public String GetNameRef() {
    return ogrJNI.FieldDefn_GetNameRef(swigCPtr, this);
  }

  public void SetName(String name) {
    ogrJNI.FieldDefn_SetName(swigCPtr, this, name);
  }

  public String GetAlternativeName() {
    return ogrJNI.FieldDefn_GetAlternativeName(swigCPtr, this);
  }

  public String GetAlternativeNameRef() {
    return ogrJNI.FieldDefn_GetAlternativeNameRef(swigCPtr, this);
  }

  public void SetAlternativeName(String alternativeName) {
    ogrJNI.FieldDefn_SetAlternativeName(swigCPtr, this, alternativeName);
  }

  public int GetFieldType() {
    return ogrJNI.FieldDefn_GetFieldType(swigCPtr, this);
  }

  public void SetType(int type) {
    ogrJNI.FieldDefn_SetType(swigCPtr, this, type);
  }

  public int GetSubType() {
    return ogrJNI.FieldDefn_GetSubType(swigCPtr, this);
  }

  public void SetSubType(int type) {
    ogrJNI.FieldDefn_SetSubType(swigCPtr, this, type);
  }

  public int GetJustify() {
    return ogrJNI.FieldDefn_GetJustify(swigCPtr, this);
  }

  public void SetJustify(int justify) {
    ogrJNI.FieldDefn_SetJustify(swigCPtr, this, justify);
  }

  public int GetWidth() {
    return ogrJNI.FieldDefn_GetWidth(swigCPtr, this);
  }

  public void SetWidth(int width) {
    ogrJNI.FieldDefn_SetWidth(swigCPtr, this, width);
  }

  public int GetPrecision() {
    return ogrJNI.FieldDefn_GetPrecision(swigCPtr, this);
  }

  public void SetPrecision(int precision) {
    ogrJNI.FieldDefn_SetPrecision(swigCPtr, this, precision);
  }

  public String GetTypeName() {
    return ogrJNI.FieldDefn_GetTypeName(swigCPtr, this);
  }

  public String GetFieldTypeName(int type) {
    return ogrJNI.FieldDefn_GetFieldTypeName(swigCPtr, this, type);
  }

  public int IsIgnored() {
    return ogrJNI.FieldDefn_IsIgnored(swigCPtr, this);
  }

  public void SetIgnored(int bIgnored) {
    ogrJNI.FieldDefn_SetIgnored(swigCPtr, this, bIgnored);
  }

  public int IsNullable() {
    return ogrJNI.FieldDefn_IsNullable(swigCPtr, this);
  }

  public void SetNullable(int bNullable) {
    ogrJNI.FieldDefn_SetNullable(swigCPtr, this, bNullable);
  }

  public int IsUnique() {
    return ogrJNI.FieldDefn_IsUnique(swigCPtr, this);
  }

  public void SetUnique(int bUnique) {
    ogrJNI.FieldDefn_SetUnique(swigCPtr, this, bUnique);
  }

  public String GetDefault() {
    return ogrJNI.FieldDefn_GetDefault(swigCPtr, this);
  }

  public void SetDefault(String pszValue) {
    ogrJNI.FieldDefn_SetDefault(swigCPtr, this, pszValue);
  }

  public int IsDefaultDriverSpecific() {
    return ogrJNI.FieldDefn_IsDefaultDriverSpecific(swigCPtr, this);
  }

  public String GetDomainName() {
    return ogrJNI.FieldDefn_GetDomainName(swigCPtr, this);
  }

  public void SetDomainName(String name) {
    ogrJNI.FieldDefn_SetDomainName(swigCPtr, this, name);
  }

}
