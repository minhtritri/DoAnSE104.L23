create database QuanLyNhaThuoc
go

use QuanLyNhaThuoc

go
create table NHACUNGCAP (
   MANCC                char(10)             not null	primary key,
   TENNCC               varchar(50)          null,
   DIACHI               varchar(50)          null,
   SDT            char(10)                  null,
   EMAIL				varchar(50)			 null,
   NgayDKHD				smalldatetime		 null,
   THOIHANHOPDONG		int					 null,
)





create table KHACHHANG(
	MAKH			char(10) not null primary key,
	HOTEN			varchar(50)	null,
	GIOITINH		char(3)	null,
	NAMSINH			char(10) null,
	SDT				char(10) 	null,
)
create table NHANVIEN(
	MANV			char(10) not null primary key,
	HOTEN			varchar(50)	null,
	GIOITINH		char(3)	null,
	NAMSINH			int null,
	SDT				char(10) 	null,
	DIACHI			varchar(50)	null,
	NAMVL			int		null,
	CALV			int	null,

)
create table PHIEUNHAPHANG (
   MAPN                 char(10)             not null	primary key,
   MANV                 char(10)             not null,
   TENNV				varCHAR(50)				NULL,
   MANCC                char(10)             null,
   TENNCC				varCHAR(50)			NULL,
   NGAYMUA              smalldatetime             null,
   TRIGIA               float                null,
   CONSTRAINT fk_manv_pnh foreign key(MANV) references NHANVIEN (MANV),
   CONSTRAINT fk_mancc_pnh foreign key(MANCC) references NHACUNGCAP(MANCC),
)
create table THUOC(
	MATHUOC              char(10) not null,
    TENTHUOC             varchar(50)	null,
    PHANNHOM             varchar(50)	null,
    PHANLOAI             varchar(50)	null,
    THANHPHAN            varchar(50)	null,

	HANSUDUNG            smalldatetime,
    
    DVT					char(20)	null,
  MANCC                char(10)	 null,
    primary key (MATHUOC),
	CONSTRAINT fk_mancc foreign key(MANCC) references NHACUNGCAP(MANCC),
)
create table HOADON (
   MAHD                 char(10)             not null	primary key,
   MANV                 char(10)              null,
   TENNV				varchar(50)			null,
   MAKH                 char(10)              null,
   TENKH				varchar(50)			null,
   NGAYMUATHUOC             smalldatetime             null,
   TONGTIEN				float				null,
   CONSTRAINT fk_makh_hd foreign key(MAKH) references KHACHHANG (MAKH),
   CONSTRAINT fk_manv_hd foreign key(MANV) references NHANVIEN (MANV),
)
create table CTHD(
	MACTHD		char(10) not null primary key,
	MAHD		char(10)	 null,
	MATHUOC		char(10)	null,
	SL			int null,
	DONGIA		float	null,
	THANHTIEN	float	null,
	CONSTRAINT fk_mahd_cthd foreign key(MAHD) references HOADON(MAHD),
	CONSTRAINT fk_mathuoc_cthd foreign key(MATHUOC) references THUOC(MATHUOC),
)
create table CTPN(
	MACTPN		char(10) not null primary key,
	MAPN		char(10)	 null,
	MATHUOC		char(10)	 null,
	SL			int null,
	DONGIA		float	null,
	THANHTIEN	float	null,
	CONSTRAINT fk_mapn_ctpn foreign key(MAPN) references PHIEUNHAPHANG(MAPN),
	CONSTRAINT fk_mathuoc_ctpn foreign key(MATHUOC) references THUOC(MATHUOC),
)
