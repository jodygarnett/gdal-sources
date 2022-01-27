package org.gdal.osr;

public class osr implements osrConstants {
  public static void UseExceptions() {
    osrJNI.UseExceptions();
  }

  public static void DontUseExceptions() {
    osrJNI.DontUseExceptions();
  }

  public static boolean GetUseExceptions() {
    return osrJNI.GetUseExceptions();
  }



    /* Uninstanciable class */
    private osr()
    {
    }

  public static String GetWellKnownGeogCSAsWKT(String name) {
    return osrJNI.GetWellKnownGeogCSAsWKT__SWIG_0(name);
  }

  public static String GetUserInputAsWKT(String name) {
    return osrJNI.GetUserInputAsWKT__SWIG_0(name);
  }

  public static int GetWellKnownGeogCSAsWKT(String name, String[] argout) {
    return osrJNI.GetWellKnownGeogCSAsWKT__SWIG_1(name, argout);
  }

  public static int GetUserInputAsWKT(String name, String[] argout) {
    return osrJNI.GetUserInputAsWKT__SWIG_1(name, argout);
  }

  public static double OSRAreaOfUse_west_lon_degree_get(AreaOfUse area) {
    return osrJNI.OSRAreaOfUse_west_lon_degree_get(AreaOfUse.getCPtr(area), area);
  }

  public static double OSRAreaOfUse_south_lat_degree_get(AreaOfUse area) {
    return osrJNI.OSRAreaOfUse_south_lat_degree_get(AreaOfUse.getCPtr(area), area);
  }

  public static double OSRAreaOfUse_east_lon_degree_get(AreaOfUse area) {
    return osrJNI.OSRAreaOfUse_east_lon_degree_get(AreaOfUse.getCPtr(area), area);
  }

  public static double OSRAreaOfUse_north_lat_degree_get(AreaOfUse area) {
    return osrJNI.OSRAreaOfUse_north_lat_degree_get(AreaOfUse.getCPtr(area), area);
  }

  public static String OSRAreaOfUse_name_get(AreaOfUse area) {
    return osrJNI.OSRAreaOfUse_name_get(AreaOfUse.getCPtr(area), area);
  }

  public static CoordinateTransformation CreateCoordinateTransformation(SpatialReference src, SpatialReference dst, CoordinateTransformationOptions options) {
    long cPtr = osrJNI.CreateCoordinateTransformation__SWIG_0(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst, CoordinateTransformationOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new CoordinateTransformation(cPtr, true);
  }

  public static CoordinateTransformation CreateCoordinateTransformation(SpatialReference src, SpatialReference dst) {
    long cPtr = osrJNI.CreateCoordinateTransformation__SWIG_1(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst);
    return (cPtr == 0) ? null : new CoordinateTransformation(cPtr, true);
  }

  public static void SetPROJSearchPath(String utf8_path) {
    osrJNI.SetPROJSearchPath(utf8_path);
  }

  public static void SetPROJSearchPaths(java.util.Vector paths) {
    osrJNI.SetPROJSearchPaths(paths);
  }

  public static java.util.Vector GetPROJSearchPaths() {
    return osrJNI.GetPROJSearchPaths();
  }

  public static int GetPROJVersionMajor() {
    return osrJNI.GetPROJVersionMajor();
  }

  public static int GetPROJVersionMinor() {
    return osrJNI.GetPROJVersionMinor();
  }

  public static int GetPROJVersionMicro() {
    return osrJNI.GetPROJVersionMicro();
  }

  public static void SetPROJAuxDbPath(String utf8_path) {
    osrJNI.SetPROJAuxDbPath(utf8_path);
  }

  public static void SetPROJAuxDbPaths(java.util.Vector paths) {
    osrJNI.SetPROJAuxDbPaths(paths);
  }

  public static java.util.Vector GetPROJAuxDbPaths() {
    return osrJNI.GetPROJAuxDbPaths();
  }

}
