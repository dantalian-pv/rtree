// automatically generated by the FlatBuffers compiler, do not modify

package com.github.davidmoten.rtree.fbs.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BoxFloat_ extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public BoxFloat_ __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float minX() { return bb.getFloat(bb_pos + 0); }
  public float minY() { return bb.getFloat(bb_pos + 4); }
  public float maxX() { return bb.getFloat(bb_pos + 8); }
  public float maxY() { return bb.getFloat(bb_pos + 12); }

  public static int createBoxFloat_(FlatBufferBuilder builder, float minX, float minY, float maxX, float maxY) {
    builder.prep(4, 16);
    builder.putFloat(maxY);
    builder.putFloat(maxX);
    builder.putFloat(minY);
    builder.putFloat(minX);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public BoxFloat_ get(int j) { return get(new BoxFloat_(), j); }
    public BoxFloat_ get(BoxFloat_ obj, int j) {  return obj.__assign(__element(j), bb); }
  }
}

