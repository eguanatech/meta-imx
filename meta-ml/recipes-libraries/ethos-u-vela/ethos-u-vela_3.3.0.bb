# Copyright 2022 NXP
DESCRIPTION = "The vela tool is used to compile a TensorFlow Lite for \
Microcontrollers neural network model into an optimised version that \
can run on an embedded system containing an Arm Ethos-U NPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e3fc50a88d0a364313df4b21ef20c29e"
DEPENDS = "python3-pip-native python3-wheel-native flatbuffers python3-numpy python3-lxml"

SRC_URI = "${VELA_SRC};branch=${SRCBRANCH}"
VELA_SRC ?= "git://github.com/nxp-imx/vela-imx.git;protocol=https"
SRCBRANCH = "imx_3.3.0"
SRCREV = "ec59c0f0953ebe300419dcb5f267af9c37fc19b6"

S = "${WORKDIR}/git"

inherit setuptools3

do_compile[network] = "1"
do_compile:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}

RDEPENDS:${PN} += "flatbuffers python3-numpy python3-lxml"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
