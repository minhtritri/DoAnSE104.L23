drop table if exists THUOC;

/*==============================================================*/
/* Table: THUOC                                                 */
/*==============================================================*/
create table THUOC
(
   MATHUOC              char(5) not null,
   TENTHUOC             text,
   PHANNHOM             text,
   PHANLOAI             text,
   THANHPHAN            text,
   TENNCC               text,
   NGAYTIEPNHAN         date,
   SOLO                 char(5),
   NHASX                text,
   NGAYSX               date,
   HANSUDUNG            date,
   SL_DVT               text,
   GIABAN               float(8,2),
   primary key (MATHUOC)
);
