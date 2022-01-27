package org.gdal.ogr;

public class StyleTable {
  private boolean swigCMemOwn;
  private long swigCPtr;

  public StyleTable(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StyleTable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_StyleTable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(StyleTable obj) {
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
    if (obj instanceof StyleTable)
      equal = (((StyleTable)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public StyleTable() {
    this(ogrJNI.new_StyleTable(), true);
  }

  public int AddStyle(String pszName, String pszStyleString) {
    return ogrJNI.StyleTable_AddStyle(swigCPtr, this, pszName, pszStyleString);
  }

  public int LoadStyleTable(String utf8_path) {
    return ogrJNI.StyleTable_LoadStyleTable(swigCPtr, this, utf8_path);
  }

  public int SaveStyleTable(String utf8_path) {
    return ogrJNI.StyleTable_SaveStyleTable(swigCPtr, this, utf8_path);
  }

  public String Find(String pszName) {
    return ogrJNI.StyleTable_Find(swigCPtr, this, pszName);
  }

  public void ResetStyleStringReading() {
    ogrJNI.StyleTable_ResetStyleStringReading(swigCPtr, this);
  }

  public String GetNextStyle() {
    return ogrJNI.StyleTable_GetNextStyle(swigCPtr, this);
  }

  public String GetLastStyleName() {
    return ogrJNI.StyleTable_GetLastStyleName(swigCPtr, this);
  }

}
