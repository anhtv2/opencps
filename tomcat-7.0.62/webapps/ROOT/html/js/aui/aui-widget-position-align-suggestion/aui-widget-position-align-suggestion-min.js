YUI.add("aui-widget-position-align-suggestion",function(e,t){function p(){}var n="align",r="bottom",i="boundingBox",s="constrain",o="left",u="position",a="positionChange",f="rendered",l="right",c="top",h=e.getClassName;p.ATTRS={position:{validator:function(e){return e===r||e===c||e===o||e===l},value:c}},e.mix(p.prototype,{POSITION_ALIGN_SUGGESTION:{bottom:[e.WidgetPositionAlign.TC,e.WidgetPositionAlign.BC],left:[e.WidgetPositionAlign.RC,e.WidgetPositionAlign.LC],right:[e.WidgetPositionAlign.LC,e.WidgetPositionAlign.RC],top:[e.WidgetPositionAlign.BC,e.WidgetPositionAlign.TC]},_hasAlignmentPoints:!1,_lastPosition:null,initializer:function(t){var n=this;t&&t.align&&t.align.points&&(n._hasAlignmentPoints=!0),e.on(n._onUISetAlignPAS,n,"_uiSetAlign"),e.after(n._afterRenderUIPAS,n,"renderUI"),n.after(a,n._afterPositionChangePAS)},suggestAlignment:function(e){var t=this,r;r=t.get(n)||{},e&&(r.node=e),t._hasAlignmentPoints||(r.points=t._getAlignPointsSuggestion(t.get(u))),t.set(n,r)},_afterPositionChangePAS:function(e){var t=this;t._uiSetPosition(e.newVal,e.prevVal)},_afterRenderUIPAS:function(){var e=this;e._uiSetPosition(e.get(u))},_canWidgetAlignToNode:function(e,t){var n=this,r,i=n._getAlignPointsSuggestion(t),s=n._getAlignedXY(e,i);return r=n.getConstrainedXY(s),r[0]===s[0]&&r[1]===s[1]},_findBestPosition:function(t){var n=this,i=n.get(u),s=[i,c,r,o,l];return s=e.Array.dedupe(s),e.Array.some(s,function(e){if(n._canWidgetAlignToNode(t,e))return i=e,!0}),i},_getAlignPointsSuggestion:function(e){return this.POSITION_ALIGN_SUGGESTION[e]},_onUISetAlignPAS:function(t){var n=this,r;if(!n.get(s)||!n.get(f))return;return r=n._findBestPosition(t),n._syncPositionUI(r,n._lastPosition||n.get(u)),n._lastPosition=r,new e.Do.AlterArgs(null,[t,n._getAlignPointsSuggestion(r)])},_syncPositionUI:function(e,t){var n=this,r=n.get(i);t&&r.removeClass(h(t)),r.addClass(h(e))},_uiSetPosition:function(e,t){var n=this;n._syncPositionUI(e,t),n.suggestAlignment()}}),e.WidgetPositionAlignSuggestion=p},"2.0.0",{requires:["widget-position-align","widget-stdmod"]});
