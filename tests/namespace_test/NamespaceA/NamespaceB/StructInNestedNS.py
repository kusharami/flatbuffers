# automatically generated, do not modify

# namespace: NamespaceB

import flatbuffers

class StructInNestedNS(object):
    __slots__ = ['_tab']

    # StructInNestedNS
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # StructInNestedNS
    def A(self): return self._tab.Get(flatbuffers.number_types.Int32Flags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(0))
    # StructInNestedNS
    def B(self): return self._tab.Get(flatbuffers.number_types.Int32Flags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(4))

def CreateStructInNestedNS(builder, a, b):
    builder.Prep(4, 8)
    builder.PrependInt32(b)
    builder.PrependInt32(a)
    return builder.Offset()
