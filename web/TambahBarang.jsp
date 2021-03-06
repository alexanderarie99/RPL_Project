<%-- 
    Document   : TambahBarang
    Created on : Dec 14, 2016, 1:02:10 AM
    Author     : Bona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="oracle.jdbc.driver.*" %>
<%@page import="oracle.sql.*" %>
<%@page import="oracle.jdbc.driver.OracleDriver" %>
<%@page import="Database.Koneksi" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Jual beli barang bekas Sanata Dharma</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Mihstore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close2').on('click', function (c) {
                    $('.message2').fadeOut('slow', function (c) {
                        $('.message2').remove();
                    });
                });
            });
        </script>
        <link rel="stylesheet" href="css/etalage.css">
        <script src="js/jquery.etalage.min.js"></script>
        <script>
            jQuery(document).ready(function ($) {

                $('#etalage').etalage({
                    thumb_image_width: 300,
                    thumb_image_height: 400,
                    source_image_width: 900,
                    source_image_height: 1200,
                    show_hint: true,
                    click_callback: function (image_anchor, instance_id) {
                        alert('Callback example:\nYou clicked on an image with the anchor: "' + image_anchor + '"\n(in Etalage instance: "' + instance_id + '")');
                    }
                });

            });
        </script>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>		
    </head>
    <body> 
        <!--header-->
        <div class="container">

            <!---->
            <div class="header-top">
                <div class="logo">
                    <a href="index.html"><img src="images/logo.png" alt="" ></a>
                </div>

                <div class="clearfix"> </div>
            </div>
            <div class="header-bottom">
                <div class="top-nav">

                    <ul class="megamenu skyblue">
                        <li class="active grid"><a  href="index.html">Products</a>
                            <div class="megapanel">
                                <div class="row">
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Accessories</a></li>
                                                <li><a href="store.html">Bags</a></li>
                                                <li><a href="store.html">Caps & Hats</a></li>
                                                <li><a href="store.html">Hoodies & Sweatshirts</a></li>
                                                <li><a href="store.html">Jackets & Coats</a></li>
                                                <li><a href="store.html">Jeans</a></li>
                                                <li><a href="store.html">Jewellery</a></li>
                                                <li><a href="store.html">Jumpers & Cardigans</a></li>
                                                <li><a href="store.html">Leather Jackets</a></li>
                                                <li><a href="store.html">Long Sleeve T-Shirts</a></li>
                                                <li><a href="store.html">Loungewear</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Shirts</a></li>
                                                <li><a href="store.html">Shoes, Boots & Trainers</a></li>
                                                <li><a href="store.html">Shorts</a></li>
                                                <li><a href="store.html">Suits & Blazers</a></li>
                                                <li><a href="store.html">Sunglasses</a></li>
                                                <li><a href="store.html">Sweatpants</a></li>
                                                <li><a href="store.html">Swimwear</a></li>
                                                <li><a href="store.html">Trousers & Chinos</a></li>
                                                <li><a href="store.html">T-Shirts</a></li>
                                                <li><a href="store.html">Underwear & Socks</a></li>
                                                <li><a href="store.html">Vests</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="store.html">Levis</a></li>
                                                <li><a href="store.html">Persol</a></li>
                                                <li><a href="store.html">Nike</a></li>
                                                <li><a href="store.html">Edwin</a></li>
                                                <li><a href="store.html">New Balance</a></li>
                                                <li><a href="store.html">Jack & Jones</a></li>
                                                <li><a href="store.html">Paul Smith</a></li>
                                                <li><a href="store.html">Ray-Ban</a></li>
                                                <li><a href="store.html">Wood Wood</a></li>
                                            </ul>	
                                        </div>												
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li><a class="pink"  href="404.html">ideas</a></li>
                        <li class="grid"><a  href="#">Brands</a>
                            <div class="megapanel">
                                <div class="row">
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Accessories</a></li>
                                                <li><a href="store.html">Bags</a></li>
                                                <li><a href="store.html">Caps & Hats</a></li>
                                                <li><a href="store.html">Hoodies & Sweatshirts</a></li>
                                                <li><a href="store.html">Jackets & Coats</a></li>
                                                <li><a href="store.html">Jeans</a></li>
                                                <li><a href="store.html">Jewellery</a></li>
                                                <li><a href="store.html">Jumpers & Cardigans</a></li>
                                                <li><a href="store.html">Leather Jackets</a></li>
                                                <li><a href="store.html">Long Sleeve T-Shirts</a></li>
                                                <li><a href="store.html">Loungewear</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Shirts</a></li>
                                                <li><a href="store.html">Shoes, Boots & Trainers</a></li>
                                                <li><a href="store.html">Shorts</a></li>
                                                <li><a href="store.html">Suits & Blazers</a></li>
                                                <li><a href="store.html">Sunglasses</a></li>
                                                <li><a href="store.html">Sweatpants</a></li>
                                                <li><a href="store.html">Swimwear</a></li>
                                                <li><a href="store.html">Trousers & Chinos</a></li>
                                                <li><a href="store.html">T-Shirts</a></li>
                                                <li><a href="store.html">Underwear & Socks</a></li>
                                                <li><a href="store.html">Vests</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="store.html">Levis</a></li>
                                                <li><a href="store.html">Persol</a></li>
                                                <li><a href="store.html">Nike</a></li>
                                                <li><a href="store.html">Edwin</a></li>
                                                <li><a href="store.html">New Balance</a></li>
                                                <li><a href="store.html">Jack & Jones</a></li>
                                                <li><a href="store.html">Paul Smith</a></li>
                                                <li><a href="store.html">Ray-Ban</a></li>
                                                <li><a href="store.html">Wood Wood</a></li>
                                            </ul>	
                                        </div>												
                                    </div>
                                </div>
                            </div>
                        </li>

                        <li><a class="pink" href="gifts.html">gifts</a></li>
                        <li class="grid"><a  href="#">stores</a>
                            <div class="megapanel">
                                <div class="row">
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Accessories</a></li>
                                                <li><a href="store.html">Bags</a></li>
                                                <li><a href="store.html">Caps & Hats</a></li>
                                                <li><a href="store.html">Hoodies & Sweatshirts</a></li>
                                                <li><a href="store.html">Jackets & Coats</a></li>
                                                <li><a href="store.html">Jeans</a></li>
                                                <li><a href="store.html">Jewellery</a></li>
                                                <li><a href="store.html">Jumpers & Cardigans</a></li>
                                                <li><a href="store.html">Leather Jackets</a></li>
                                                <li><a href="store.html">Long Sleeve T-Shirts</a></li>
                                                <li><a href="store.html">Loungewear</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <ul>
                                                <li><a href="store.html">Shirts</a></li>
                                                <li><a href="store.html">Shoes, Boots & Trainers</a></li>
                                                <li><a href="store.html">Shorts</a></li>
                                                <li><a href="store.html">Suits & Blazers</a></li>
                                                <li><a href="store.html">Sunglasses</a></li>
                                                <li><a href="store.html">Sweatpants</a></li>
                                                <li><a href="store.html">Swimwear</a></li>
                                                <li><a href="store.html">Trousers & Chinos</a></li>
                                                <li><a href="store.html">T-Shirts</a></li>
                                                <li><a href="store.html">Underwear & Socks</a></li>
                                                <li><a href="store.html">Vests</a></li>
                                            </ul>	
                                        </div>							
                                    </div>
                                    <div class="col1">
                                        <div class="h_nav">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="store.html">Levis</a></li>
                                                <li><a href="store.html">Persol</a></li>
                                                <li><a href="store.html">Nike</a></li>
                                                <li><a href="store.html">Edwin</a></li>
                                                <li><a href="store.html">New Balance</a></li>
                                                <li><a href="store.html">Jack & Jones</a></li>
                                                <li><a href="store.html">Paul Smith</a></li>
                                                <li><a href="store.html">Ray-Ban</a></li>
                                                <li><a href="store.html">Wood Wood</a></li>
                                            </ul>	
                                        </div>												
                                    </div>
                                </div>
                            </div>
                        </li>

                    </ul> 
                </div>

                <div class="clearfix"> </div>
            </div>

            <div class="content">
                <div class="account-in register-top" >
                    <h2>TAMBAH BARANG</h2>
                    <div class=" account-top register">
                        <form action="/ProyekPRL/TambahBarang" method="POST">
                            <div> 	
                                <span>Nama Barang*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                <input type="text" name="namabarang"> 
                            </div>
                            <div>
                                <div>
                                    <span>Jenis Barang*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                    
                                    <select name="kategori" style="height: 40px; width: 648px" >
                                        <%
                                            PreparedStatement statement = null;
                                            ResultSet rst = null;
                                            Connection con = null;
                                            Koneksi db = new Koneksi();
                                            con = db.getConnection();
                                            statement = con.prepareStatement("SELECT * FROM KATEGORI");
                                            rst = statement.executeQuery();
                                            while (rst.next()) {
                                        %>
                                     <option value="<% out.println(rst.getString(1)); %>"> <%out.println(rst.getString(2)); %></option>
                                      <%  }
                                    %>
                                    </select>
                                </div>

                            </div>
                            <div> 
                                <span>Harga Barang*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                <input type="text" name="hargabarang" value="" />
                            </div>	
                            <div> 
                                <span  class="word-in">Deskripsi Barang*</span>
                                <textarea name="deskripsi" style="height: 160px; width: 648px"></textarea>

                            </div>	
                            <div> 
                                <span class="button">Gambar*</span>
                                <input type="submit" value="Upload">
                            </div>	
                            <div>
                                <span style="padding: 30px">&nbsp;</span>

                                <input type="submit" value="Tambah"> <input type="submit" value="Cancel"> 


                            </div>
                        </form>
                    </div>

                </div>	


            </div>
            <!---->
            <div class="footer">
                <p class="footer-class" align="center">© 2016 Komunitas Barang Bekas USD  </p>


                <div class="clearfix"> </div>
            </div>
        </div>

        <!---->
    </body>
</html>
