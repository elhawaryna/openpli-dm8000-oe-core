MACHINE_KERNEL_PR_append = ".${INC_PR}.84"

COMPATIBLE_MACHINE = "dm8000"

PATCHLEVEL = "101"

SRC_URI = " \
			${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.2.tar.bz2;name=kernel \
			${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.2.${PATCHLEVEL}.xz;apply=yes;name=kernel-patch \
			http://download.filesystems.org/unionfs/unionfs-2.x-latest/unionfs-2.6_for_3.2.62.diff.gz;name=unionfs \
			file://001-linux-dreambox-kernel.patch \
			file://002-remove-duplicate-tcp-filter-hook-in-ipv6.patch \
			file://003-change-function-to-setattr-prepare.patch \
			file://004-clear_sublevel.patch \
			file://005-Revert-MIPS-Fix-potencial-corruption.patch \
			file://006-fadvise_dontneed_change.patch \
			file://007-fix-proc-cputype.patch \
			file://008-misc-latin1-to-utf8-conversions.patch \
			file://009-rtl8712-backport-b.patch \
			file://010-rtl8712-backport-c.patch \
			file://011-rtl8712-backport-d.patch \
			file://012-make-3.82-hack.patch \
			file://013-brmcnand_base-disable-flash-BBT-on-64MB-nand.patch \
			file://014-ubifs-add-config-option-to-use-zlib-as-default-compr.patch \
			file://015-em28xx_fix_terratec_entries.patch \
			file://016-em28xx_add_terratec_h5_rev3.patch \
			file://017-dvb-usb-siano-always-load-smsdvb.patch \
			file://018-dvb-usb-af9035.patch \
			file://019-dvb-usb-a867.patch \
			file://020-dvb-usb-rtl2832.patch \
			file://021-dvb_usb_disable_rc_polling.patch \
			file://022-dvb-usb-smsdvb_fix_frontend.patch \
			file://023-it913x-backport-changes-to-3.2-kernel.patch \
			file://024-rtl8712-fix-warnings.patch \
			file://025-fixme-hardfloat.patch \
			file://026-correctly-initiate-nand-flash-ecc-config-when-old-2n.patch \
			file://027-kernel-add-support-for-gcc7.patch \
			file://028-fix-build-with-gcc7.patch \
			file://029-move-field-atomic-flags-to-the-bottom-of-structure.patch \
			file://defconfig \
"

SRC_URI[kernel.md5sum] = "7ceb61f87c097fc17509844b71268935"
SRC_URI[kernel.sha256sum] = "c881fc2b53cf0da7ca4538aa44623a7de043a41f76fd5d0f51a31f6ed699d463"
SRC_URI[kernel-patch.md5sum] = "9239882ed95205d4fcda5ad97dbd371b"
SRC_URI[kernel-patch.sha256sum] = "3d86133237fce58758980c26125360ea118da347853c898225959853458c8b6d"
SRC_URI[unionfs.md5sum] = "348e5021d5340f12e2968ff4eb74d45d"
SRC_URI[unionfs.sha256sum] = "c0c449a445e9e07c5b1ba8e8c40013c0e40a5948c30a7190677d19ba7358c11a"

require linux-dreambox.inc

S = "${WORKDIR}/linux-3.2"
