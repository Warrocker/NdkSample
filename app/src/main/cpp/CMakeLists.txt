cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_VERBOSE_MAKEFILE on)
set(lib_src_DIR ${CMAKE_CURRENT_SOURCE_DIR})
set(lib_build_DIR $ENV{HOME}/tmp/${ANDROID_ABI})

add_subdirectory(${lib_src_DIR}/string-utils ${lib_build_DIR}/string-utils)
add_subdirectory(${lib_src_DIR}/number-utils ${lib_build_DIR}/number-utils)

