package org.gdal.ogr;

import org.gdal.gdal.MajorObject;

public class Driver extends MajorObject {
  private transient long swigCPtr;

  protected Driver(long cPtr, boolean cMemoryOwn) {
    super(ogrJNI.Driver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Driver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Driver obj) {
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
    if (obj instanceof Driver)
      equal = (((Driver)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String getName() {
    return ogrJNI.Driver_name_get(swigCPtr, this);
  }

  public DataSource CreateDataSource(String utf8_path, java.util.Vector options) {
    long cPtr = ogrJNI.Driver_CreateDataSource__SWIG_0(swigCPtr, this, utf8_path, options);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public DataSource CreateDataSource(String utf8_path) {
    long cPtr = ogrJNI.Driver_CreateDataSource__SWIG_1(swigCPtr, this, utf8_path);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public DataSource CopyDataSource(DataSource copy_ds, String utf8_path, java.util.Vector options) {
    long cPtr = ogrJNI.Driver_CopyDataSource__SWIG_0(swigCPtr, this, DataSource.getCPtr(copy_ds), copy_ds, utf8_path, options);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public DataSource CopyDataSource(DataSource copy_ds, String utf8_path) {
    long cPtr = ogrJNI.Driver_CopyDataSource__SWIG_1(swigCPtr, this, DataSource.getCPtr(copy_ds), copy_ds, utf8_path);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public DataSource Open(String utf8_path, int update) {
    long cPtr = ogrJNI.Driver_Open__SWIG_0(swigCPtr, this, utf8_path, update);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public DataSource Open(String utf8_path) {
    long cPtr = ogrJNI.Driver_Open__SWIG_1(swigCPtr, this, utf8_path);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public int DeleteDataSource(String utf8_path) {
    return ogrJNI.Driver_DeleteDataSource(swigCPtr, this, utf8_path);
  }

  public boolean TestCapability(String cap) {
    return ogrJNI.Driver_TestCapability(swigCPtr, this, cap);
  }

  public String GetName() {
    return ogrJNI.Driver_GetName(swigCPtr, this);
  }

  public void Register() {
    ogrJNI.Driver_Register(swigCPtr, this);
  }

  public void Deregister() {
    ogrJNI.Driver_Deregister(swigCPtr, this);
  }

}
