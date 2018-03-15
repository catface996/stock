<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>折线、多边形、圆</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script src="http://webapi.amap.com/maps?v=1.3&key=9843a4770442727a800ec64ca8e0364f"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>

    <script src="//webapi.amap.com/ui/1.0/main.js?v=1.0.10"></script>
    <style>
        html,
        body,
        #container {
            width: 100%;
            height: 100%;
            margin: 0px;
        }

        /**
         * 利用 containerClassNames: 'my-marker' 设置label样式
         */

        .amap-simple-marker.my-marker .amap-simple-marker-label {
            color: #fff;
            font-size: 16px;
            font-style: italic;
            text-decoration: line-through;
        }
    </style>
</head>
<body>
<div id="container"></div>
<script>
    var map = new AMap.Map('container', {
        resizeEnable: true,
        center: ${center},
        zoom: 12
    });
    var lineArr = ${polyLine};
    var polyline = new AMap.Polyline({
        path: lineArr,          //设置线覆盖物路径
        strokeColor: "#3366FF", //线颜色
        strokeOpacity: 1,       //线透明度
        strokeWeight: 5,        //线宽
        strokeStyle: "solid",   //线样式
        strokeDasharray: [10, 5] //补充线样式
    });
    polyline.setMap(map);


    AMapUI.loadUI(['overlay/SimpleMarker'], function (SimpleMarker) {

        var iconStyles = SimpleMarker.getBuiltInIconStyles();

        new SimpleMarker({
            //使用内置的iconStyle
            iconStyle: iconStyles[2],

            //图标文字
            iconLabel: {
                //A,B,C.....
                innerHTML: '起',
                style: {
                    //颜色, #333, red等等，这里仅作示例，取iconStyle中首尾相对的颜色
                    color: 'white'
                }
            },

            //显示定位点
            //showPositionPoint:true,

            map: map,
            position: [${start.longitude},${start.latitude}],

            //Marker的label(见http://lbs.amap.com/api/javascript-api/reference/overlay/#Marker)
            label: {
                content: '${start.arriveTime?string("yyyy-MM-dd HH:mm:ss")}-${end.dispatchTime?string("yyyy-MM-dd HH:mm:ss")}${start.addressName}',
                offset: new AMap.Pixel(27, 25)
            }
        });

    <#list markPoints as mark>
        new SimpleMarker({
            //使用内置的iconStyle
            iconStyle: iconStyles[3],

            //图标文字
            iconLabel: {
                //A,B,C.....
                innerHTML: '经',
                style: {
                    //颜色, #333, red等等，这里仅作示例，取iconStyle中首尾相对的颜色
                    color: 'white'
                }
            },

            //显示定位点
            //showPositionPoint:true,

            map: map,
            position: [${mark.longitude},${mark.latitude}],

            //Marker的label(见http://lbs.amap.com/api/javascript-api/reference/overlay/#Marker)
            label: {
                content: '${mark.arriveTime?string("yyyy-MM-dd HH:mm:ss")}-${mark.dispatchTime?string("yyyy-MM-dd HH:mm:ss")}${mark.addressName}',
                offset: new AMap.Pixel(27, 25)
            }
        });
    </#list>

        new SimpleMarker({
            //使用内置的iconStyle
            iconStyle: iconStyles[0],

            //图标文字
            iconLabel: {
                //A,B,C.....
                innerHTML: '终',
                style: {
                    //颜色, #333, red等等，这里仅作示例，取iconStyle中首尾相对的颜色
                    color: 'white'
                }
            },

            //显示定位点
            //showPositionPoint:true,

            map: map,
            position: [${end.longitude},${end.latitude}],

            //Marker的label(见http://lbs.amap.com/api/javascript-api/reference/overlay/#Marker)
            label: {
                content: '${end.arriveTime?string("yyyy-MM-dd HH:mm:ss")}-${end.dispatchTime?string("yyyy-MM-dd HH:mm:ss")}${end.addressName}',
                offset: new AMap.Pixel(27, 25)
            }
        });

//        new SimpleMarker({
//
//            containerClassNames: 'my-marker',
//            //普通文本
//            iconLabel: 'BC',
//
//            iconStyle: 'green',
//
//            map: map,
//            position: lngLats[1]
//        });

//        new SimpleMarker({
//
//            //设置节点属性
//            iconLabel: {
//                //普通文本
//                innerHTML: '热',
//                //设置样式
//                style: {
//                    color: '#fff',
//                    fontSize: '120%',
//                    marginTop: '2px'
//                }
//            },
//
//            iconStyle: 'red',
//            map: map,
//            position: lngLats[2]
//        });

//        new SimpleMarker({
//            iconLabel: {
//                //html
//                innerHTML: '<div class="my-blue-point"><img src="//webapi.amap.com/theme/v1.3/hotNew.png"/></div>',
//            },
//            iconStyle: 'black',
//            map: map,
//            position: lngLats[3]
//        });
    });

</script>
</body>
</html>