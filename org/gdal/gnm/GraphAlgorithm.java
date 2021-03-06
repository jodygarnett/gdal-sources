package org.gdal.gnm;

public final class GraphAlgorithm {
  public final static GraphAlgorithm GATDijkstraShortestPath = new GraphAlgorithm("GATDijkstraShortestPath", gnmJNI.GATDijkstraShortestPath_get());
  public final static GraphAlgorithm GATKShortestPath = new GraphAlgorithm("GATKShortestPath", gnmJNI.GATKShortestPath_get());
  public final static GraphAlgorithm GATConnectedComponents = new GraphAlgorithm("GATConnectedComponents", gnmJNI.GATConnectedComponents_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GraphAlgorithm swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GraphAlgorithm.class + " with value " + swigValue);
  }

  private GraphAlgorithm(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GraphAlgorithm(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GraphAlgorithm(String swigName, GraphAlgorithm swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GraphAlgorithm[] swigValues = { GATDijkstraShortestPath, GATKShortestPath, GATConnectedComponents };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

