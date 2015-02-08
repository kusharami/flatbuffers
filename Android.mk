LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := flatbuffers_static

LOCAL_MODULE_FILENAME := flatbuffers

ifeq ($(TARGET_ARCH_ABI),armeabi-v7a)

	LOCAL_ARM_MODE := arm

endif


LOCAL_SRC_FILES := \
src/flatc.cpp \
src/idl_gen_cpp.cpp \
src/idl_gen_fbs.cpp \
src/idl_gen_general.cpp \
src/idl_gen_go.cpp \
src/idl_gen_text.cpp \
src/idl_parser.cpp

LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_C_INCLUDES)

LOCAL_CPPFLAGS += -fexceptions
                                 
include $(BUILD_STATIC_LIBRARY)
