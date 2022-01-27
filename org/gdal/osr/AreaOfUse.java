package org.gdal.osr;

public class AreaOfUse {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AreaOfUse(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AreaOfUse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        osrJNI.delete_AreaOfUse(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(AreaOfUse obj) {
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
    if (obj instanceof AreaOfUse)
      equal = (((AreaOfUse)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public double getWest_lon_degree() {
    return osrJNI.AreaOfUse_west_lon_degree_get(swigCPtr, this);
  }

  public double getSouth_lat_degree() {
    return osrJNI.AreaOfUse_south_lat_degree_get(swigCPtr, this);
  }

  public double getEast_lon_degree() {
    return osrJNI.AreaOfUse_east_lon_degree_get(swigCPtr, this);
  }

  public double getNorth_lat_degree() {
    return osrJNI.AreaOfUse_north_lat_degree_get(swigCPtr, this);
  }

  public String getName() {
    return osrJNI.AreaOfUse_name_get(swigCPtr, this);
  }

  public AreaOfUse(double west_lon_degree, double south_lat_degree, double east_lon_degree, double north_lat_degree, String name) {
    this(osrJNI.new_AreaOfUse(west_lon_degree, south_lat_degree, east_lon_degree, north_lat_degree, name), true);
  }

}
