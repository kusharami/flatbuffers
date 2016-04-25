// automatically generated, do not modify

package NamespaceA;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TableInC extends Table {
  public static TableInC getRootAsTableInC(ByteBuffer _bb) { return getRootAsTableInC(_bb, new TableInC()); }
  public static TableInC getRootAsTableInC(ByteBuffer _bb, TableInC obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public TableInC __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public NamespaceA.TableInFirstNS referToA1() { return referToA1(new NamespaceA.TableInFirstNS()); }
  public NamespaceA.TableInFirstNS referToA1(NamespaceA.TableInFirstNS obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public SecondTableInA referToA2() { return referToA2(new SecondTableInA()); }
  public SecondTableInA referToA2(SecondTableInA obj) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createTableInC(FlatBufferBuilder builder,
      int refer_to_a1Offset,
      int refer_to_a2Offset) {
    builder.startObject(2);
    TableInC.addReferToA2(builder, refer_to_a2Offset);
    TableInC.addReferToA1(builder, refer_to_a1Offset);
    return TableInC.endTableInC(builder);
  }

  public static void startTableInC(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addReferToA1(FlatBufferBuilder builder, int referToA1Offset) { builder.addOffset(0, referToA1Offset, 0); }
  public static void addReferToA2(FlatBufferBuilder builder, int referToA2Offset) { builder.addOffset(1, referToA2Offset, 0); }
  public static int endTableInC(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

