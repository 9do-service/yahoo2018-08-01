#台灣商品交易資料庫應用計畫

透過各種不同程式語言的撰寫，提供各平台分析與使用交易資料庫，讓觀察家更即時觀察到消費者的消費資訊。

資料庫內容為 2018 年 8 月 1 日一整天，Yahoo 拍賣網在台灣的交易狀況，開發者可以自行透過 Android java 程式的撰寫讀取資料庫的內容，並以圖表的方式呈現其結果，開發與分析消費者的消費概況。範例資料庫的欄位包含：company_id(店家統編)、company_name(店家名稱)、userID(消費者裝置代碼)、inv_date(發票日期)、product_name(產品名稱)、unit_price(產品購買單價)、quantity(產品購買數量)、inv_time(購物時間)、pay_type(付款方式)。如果開發者想要開發商品比價的 App ，可以 group by 產品名稱欄位並以 inv_time 由小到大排序，以值方圖或摺線圖呈現，就可以觀察一天內商品價格的變化。其他更多的應用，請開發者自行思考規劃。
![image](https://github.com/9do-service/yahoo2018-08-01/blob/master/db.png)
