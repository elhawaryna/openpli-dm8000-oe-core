SUMMARY = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
LICENSE = "CLOSED"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_${PN} += "virtual/blindscan-dvbs virtual/blindscan-dvbc"

DEPENDS = "ncurses"

COMPATIBLE_MACHINE = "^(dm500hd|dm500hdv2|dm520|dm800se|dm800sev2|dm820|dm900|dm920|dm7020hd|dm7080|dm8000)$"

PV = "1.12"

DREAMBOXURL = "http://dreamboxupdate.com/download/opendreambox"

SRC_URI = "${DREAMBOXURL}/2.2.0/blindscan-utils/${PV}/${DEFAULTTUNE}/2acb58192434f308bfed6879c51d5d6e/blindscan-utils_${PV}_${DEFAULTTUNE}.tar.xz;name=${DEFAULTTUNE}-dora"

SRC_URI_dm900 = "${DREAMBOXURL}/2.5.0/blindscan-utils/${PV}/${DEFAULTTUNE}/9e93783a6ac4611bb683d0b36fc44a87/blindscan-utils_${PV}_${DEFAULTTUNE}.tar.xz;name=${DEFAULTTUNE}-krogoth"

SRC_URI_dm920 = "${SRC_URI_dm900}"

SRC_URI_dm520 = "${DREAMBOXURL}/2.5.0/blindscan-utils/${PV}/${DEFAULTTUNE}/185cd9490723728f39953348e322f5c7/blindscan-utils_${PV}_${DEFAULTTUNE}.tar.xz;name=${DEFAULTTUNE}-krogoth"

SRC_URI_dm820 = "${SRC_URI_dm520}"

SRC_URI_dm7080 = "${SRC_URI_dm520}"

S = "${WORKDIR}/blindscan-utils_${PV}_${DEFAULTTUNE}"

PACKAGES = "${PN}"

SRC_URI[mips32el-nf-denzil.md5sum] = "143cb7253132af1ecd3aafa3679c6109"
SRC_URI[mips32el-nf-denzil.sha256sum] = "53d2760e3aa19eab6e19edabe8b9dd840c693ca30c43495904241e52fd40ea32"
SRC_URI[mips32el-dora.md5sum] = "2acb58192434f308bfed6879c51d5d6e"
SRC_URI[mips32el-dora.sha256sum] = "afe56c1d222c4d6d33509208116628c30f88916bda7a19e5c749dcbc914d6020"
SRC_URI[cortexa15hf-neon-vfpv4-krogoth.md5sum] = "9e93783a6ac4611bb683d0b36fc44a87"
SRC_URI[cortexa15hf-neon-vfpv4-krogoth.sha256sum] = "ff4de20d84cf6aef48270684cb78764f7ee9d13d92fab42217f378be06047d1f"
SRC_URI[mips32el-krogoth.md5sum] = "185cd9490723728f39953348e322f5c7"
SRC_URI[mips32el-krogoth.sha256sum] = "0458975ad8325355a5e9514fa4e3505f896298bdad7610718e090b640e3588c5"

do_install() {
    cp -r * ${D}
}

INHIBIT_PACKAGE_STRIP = "1"
