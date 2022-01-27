package org.gdal.ogr;

public class PreparedGeometry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PreparedGeometry(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PreparedGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_PreparedGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(PreparedGeometry obj) {
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
    if (obj instanceof PreparedGeometry)
      equal = (((PreparedGeometry)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public boolean Intersects(Geometry otherGeom) {
    return ogrJNI.PreparedGeometry_Intersects(swigCPtr, this, Geometry.getCPtr(otherGeom), otherGeom);
  }

  public boolean Contains(Geometry otherGeom) {
    return ogrJNI.PreparedGeometry_Contains(swigCPtr, this, Geometry.getCPtr(otherGeom), otherGeom);
  }

}
