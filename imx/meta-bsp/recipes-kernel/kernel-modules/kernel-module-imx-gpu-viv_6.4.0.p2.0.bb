require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "next"
KERNEL_SRC  = "git://bitbucket.sw.nxp.com/lfac/linux-nxp.git;protocol=ssh"

#SRCREV = "${AUTOREV}"
SRCREV = "780817a99f510ae963256e97b20ffa80761a4f19"

LOCALVERSION = "-5.4-zeus-${KERNEL_BRANCH}"
