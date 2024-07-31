YUI.add("aui-datatable-edit",function(e,t){var n=e.Lang,r=e.Array,i=e.Escape,s=n.isArray,o=n.isBoolean,u=n.isFunction,a=n.isObject,f=n.isString,l=n.isValue,c=n.String,h=e.DataType,p=function(t){return t instanceof e.BaseCellEditor},d=e.WidgetStdMod,v=e.getClassName,m="activeCell",g="add",y="addOption",b="baseCellEditor",w="boundingBox",E="calendar",S="cancel",x="cell",T="celleditor",N="checkboxCellEditor",C="checked",k="click",L="contentBox",A="data",O="datatable",M="dateCellEditor",_="dd",D="delete",P="disk",H="dotted",B="dropDownCellEditor",j="edit",F="editEvent",I="editOptions",q="editable",R="editor",U="element",z="elementName",W="grip",X="handle",V="hide",$="hideOnSave",J="icon",K="initEdit",Q="initToolbar",G="initValidator",Y="input",Z="inputFormatter",et="key",tt="label",nt="link",rt="mousedown",it="multiple",t="name",st="only",ot="option",ut="options",at="optionsCellEditor",ft="outputFormatter",lt="pencil",ct="radioCellEditor",ht="read",pt="readOnly",dt="remove",vt="render",mt="rendered",gt="return",yt="row",bt="save",wt="selected",Et="selectedAttrName",St="showToolbar",xt="submit",Tt="textAreaCellEditor",Nt="textCellEditor",Ct="toolbar",kt="unescapeValue",Lt="validator",At="value",Ot="vertical",Mt="visible",_t="wrapper",Dt="zIndex",Pt=",",Ht=".",Bt="",jt="\n",Ft=" ",It=/<br\s*\/?>/gi,qt=/[\r\n]/g,Rt=v(T,j),Ut=v(T,j,g,ot),zt=v(T,j,_,X),Wt=v(T,j,D,ot),Xt=v(T,j,V,ot),Vt=v(T,j,Y,t),$t=v(T,j,Y,At),Jt=v(T,j,tt),Kt=v(T,j,nt),Qt=v(T,j,ot,yt),Gt=v(T,U),Yt=v(T,ot),Zt=v(O,q),en=v(J),tn=v(J,W,H,Ot),nn="<br/>",rn=function(){};rn.NAME="dataTableCellEditorSupport",rn.EDITOR_ZINDEX=9999,rn.ATTRS={editEvent:{setter:"_setEditEvent",validator:f,value:k}},e.mix(rn.prototype,{initializer:function(){var e=this,t=e.get(F);e.CLASS_NAMES_CELL_EDITOR_SUPPORT={cell:e.getClassName(x),readOnly:e.getClassName(ht,st)},e.after(vt,e._afterCellEditorSupportRender),e.delegate(t,e._onEditCell,Ht+e.CLASS_NAMES_CELL_EDITOR_SUPPORT.cell,e)},getEditor:function(e,t){var n=this,r=t.editor,i=e.get(R);return r===!1||i===!1?null:i||r},_afterCellEditorSupportRender:function(){var t=this;t._syncModelsReadOnlyUI(),t.body.after(e.bind(t._syncModelsReadOnlyUI,t),t.body,vt)},_onEditCell:function(t){var n=this,r=n.get(m),i=t.alignNode||r,s=n.getColumn(i),o=n.getRecord(i),u=n.getEditor(o,s);p(u)&&!o.get(pt)&&(u.get(mt)||(u.on({visibleChange:e.bind(n._onEditorVisibleChange,n),save:e.bind(n._onEditorSave,n)}),u.set(Dt,rn.EDITOR_ZINDEX),u.render()),u.set(At,o.get(s.key)),u.show().move(i.getXY()))},_onEditorSave:function(e){var t=this,n=e.currentTarget,r=t.getActiveColumn(),i=t.getActiveRecord();n.set(At,e.newVal),t.set(m,t.get(m)),i.set(r.key,e.newVal),t.highlight&&t.highlight.clear()},_onEditorVisibleChange:function(e){var t=this,n=e.currentTarget;e.newVal&&n._syncFocus()},_syncModelReadOnlyUI:function(e){var t=this,n=t.getRow(e);n.toggleClass(t.CLASS_NAMES_CELL_EDITOR_SUPPORT[pt],e.get(pt)===!0)},_syncModelsReadOnlyUI:function(){var e=this;e.get(A).each(function(t){e._syncModelReadOnlyUI(t)})},getCellEditor:function(){return this.getEditor.apply(this,arguments)},getRecordColumnValue:function(e,t){return e.get(t.key)}}),e.DataTable.CellEditorSupport=rn,e.Base.mix(e.DataTable,[rn]);var sn=e.Component.create({NAME:b,ATTRS:{editable:{value:!1,validator:o},elementName:{value:At,validator:f},footerContent:{value:Bt},hideOnSave:{value:!0,validator:o},inputFormatter:{value:function(e){return f(e)&&(e=e.replace(qt,nn)),e}},outputFormatter:{value:function(e){var t=this;return f(e)&&(t.get(kt)&&(e=c.unescapeEntities(e)),e=e.replace(It,jt)),e}},showToolbar:{value:!0,validator:o},strings:{value:{edit:"Edit",save:"Save",cancel:"Cancel"}},tabIndex:{value:1},toolbar:{setter:"_setToolbar",validator:a,value:null},unescapeValue:{value:!0,validator:o},validator:{setter:"_setValidator",validator:a,value:null},value:{value:Bt},visible:{value:!1}},EXTENDS:e.Overlay,UI_ATTRS:[q,St,At],prototype:{CONTENT_TEMPLATE:"<form></form>",ELEMENT_TEMPLATE:null,elements:null,validator:null,_hDocMouseDownEv:null,initializer:function(e){var t=this;t._initEvents()},destructor:function(){var e=this,t=e._hDocMouseDownEv,n=e.toolbar,r=e.validator;t&&t.detach(),n&&n.destroy(),r&&r.destroy()},bindUI:function(){var t=this;t.get(w).on(et,e.bind(t._onEscKey,t),"down:27")},formatValue:function(e,t){var n=this;return u(e)&&(t=e.call(n,t)),t},getValue:function(){var e=this;return e.formatValue(e.get(Z),e.getElementsValue())},_initEvents:function(){var t=this;t.publish({cancel:{defaultFn:t._defCancelFn},initEdit:{defaultFn:t._defInitEditFn,fireOnce:!0},initValidator:{defaultFn:t._defInitValidatorFn,fireOnce:!0},initToolbar:{defaultFn:t._defInitToolbarFn,fireOnce:!0},save:{defaultFn:t._defSaveFn}}),t.after({render:t._afterRender,visibleChange:e.debounce(t._debounceVisibleChange,350,t)}),t.on({"form-validator:submit":e.bind(t._onSubmit,t)})},_afterRender:function(){var e=this;e._handleInitValidatorEvent(),e._handleInitToolbarEvent()},_defCancelFn:function(e){var t=this;t.hide()},_defInitValidatorFn:function(t){var n=this;n.validator=new e.FormValidator(n.get(Lt))},_defInitToolbarFn:function(t){var n=this,r=n.get(q);n.toolbar=(new e.Toolbar(n.get(Ct))).render(n.footerNode),r&&n._uiSetEditable(r)},_defSaveFn:function(e){var t=this;t.get($)&&t.hide()},_debounceVisibleChange:function(t){var n=this,r=n._hDocMouseDownEv;t.newVal?r||(n._hDocMouseDownEv=e.getDoc().on(rt,e.bind(n._onDocMouseDownExt,n))):r&&(r.detach(),n._hDocMouseDownEv=null)},_handleCancelEvent:function(){var e=this;e.fire(S)},_handleEditEvent:function(){var e=this;e.fire(j)},_handleInitEditEvent:function(){var e=this;e.get(mt)&&this.fire(K)},_handleInitValidatorEvent:function(){var e=this;e.get(mt)&&this.fire(G)},_handleInitToolbarEvent:function(){var e=this;e.get(mt)&&e.get(St)&&this.fire(Q)},_handleSaveEvent:function(){var e=this;e.validator.hasErrors()||e.fire(bt,{newVal:e.getValue(),prevVal:e.get(At)})},_onDocMouseDownExt:function(e){var t=this,n=t.get(w);n.contains(e.target)||t.set(Mt,!1)},_onEscKey:function(e){var t=this
;t.hide()},_onSubmit:function(e){var t=this,n=e.validator;n&&n.formEvent.halt()},_setToolbar:function(t){var n=this,r=n.getStrings();return e.merge({activeState:!1,children:[[{on:{click:e.bind(n._handleSaveEvent,n)},label:r[bt],icon:"icon-ok-sign"},{on:{click:e.bind(n._handleCancelEvent,n)},label:r[S]}]]},t)},_setValidator:function(t){var n=this;return e.merge({boundingBox:n.get(L),bubbleTargets:n},t)},_uiSetShowToolbar:function(e){var t=this,n=t.footerNode;e?n.show():n.hide(),t._handleInitToolbarEvent()},getElementsValue:function(){var e=this,t=e.elements;return t?t.get(At):Bt},renderUI:function(){var t=this;t.ELEMENT_TEMPLATE&&(t.elements=e.Node.create(t.ELEMENT_TEMPLATE),t._syncElementsName(),t.setStdModContent(d.BODY,t.elements))},_defInitEditFn:function(e){},_syncElementsFocus:function(){var e=this;e.elements.selectText()},_syncElementsName:function(){var e=this;e.elements.setAttribute(t,e.get(z))},_syncFocus:function(){var t=this;e.later(0,t,t._syncElementsFocus)},_uiSetEditable:function(t){var n=this,r=n.toolbar;n.get(mt)&&r&&(t?r.add([{icon:"icon-edit",label:n.getString(j),on:{click:e.bind(n._handleEditEvent,n)}}],1):r.remove(1))},_uiSetValue:function(e){var t=this,n=t.elements;n&&n.val(t.formatValue(t.get(ft),e))}}});e.BaseCellEditor=sn;var on=e.Component.create({NAME:at,ATTRS:{inputFormatter:{value:null},options:{setter:"_setOptions",value:{},validator:a},outputFormatter:{value:null},selectedAttrName:{value:wt,validator:f},strings:{value:{add:"Add",cancel:"Cancel",addOption:"Add option",edit:"Edit options",editOptions:"Edit option(s)",name:"Name",remove:"Remove",save:"Save",stopEditing:"Stop editing",value:"Value"}}},EXTENDS:e.BaseCellEditor,UI_ATTRS:[ut],prototype:{EDIT_TEMPLATE:'<div class="'+Rt+'"></div>',EDIT_OPTION_ROW_TEMPLATE:'<div class="'+Qt+'">'+'<span class="'+[zt,en,tn].join(Ft)+'"></span>'+'<input class="'+Vt+'" size="7" placeholder="{titleName}" title="{titleName}" type="text" value="{valueName}" /> '+'<input class="'+$t+'" size="7" placeholder="{titleValue}" title="{titleValue}" type="text" value="{valueValue}" /> '+'<a class="'+[Kt,Wt].join(Ft)+'" href="javascript:void(0);">{remove}</a> '+"</div>",EDIT_ADD_LINK_TEMPLATE:'<a class="'+[Kt,Ut].join(Ft)+'" href="javascript:void(0);">{addOption}</a> ',EDIT_LABEL_TEMPLATE:'<div class="'+Jt+'">{editOptions}</div>',editContainer:null,editSortable:null,options:null,initializer:function(){var e=this;e.on(j,e._onEditEvent),e.on(bt,e._onSave),e.after(Q,e._afterInitToolbar)},addNewOption:function(t,n){var r=this,i=r.editContainer.one(Ht+Ut),s=e.Node.create(r._createEditOption(t||Bt,n||Bt));i.placeBefore(s),s.one(Y).focus()},removeOption:function(e){e.remove()},saveOptions:function(){var e=this,t=e.editContainer;if(t){var n=t.all(Ht+Vt),r=t.all(Ht+$t),i={};n.each(function(e,t){var n=e.val(),s=r.item(t).val();i[s]=n}),e.set(ut,i),e._uiSetValue(e.get(At)),e.toggleEdit()}},toggleEdit:function(){var e=this;e.editContainer.toggle()},_createOptions:function(t){var r=this,s=r.elements,o=[],u=[],a=r.OPTION_TEMPLATE,f=r.OPTION_WRAPPER;e.each(t,function(t,r){var s={id:e.guid(),label:i.html(t),name:i.html(r),value:i.html(r)};a&&o.push(n.sub(a,s)),f&&u.push(n.sub(f,s))});var l=e.NodeList.create(o.join(Bt)),c=e.NodeList.create(u.join(Bt));c.size()?(c.each(function(e,t){e.prepend(l.item(t))}),s.setContent(c)):s.setContent(l),r.options=l},_createEditBuffer:function(){var t=this,r=t.getStrings(),i=[];return i.push(n.sub(t.EDIT_LABEL_TEMPLATE,{editOptions:r[I]})),e.each(t.get(ut),function(e,n){i.push(t._createEditOption(e,n))}),i.push(n.sub(t.EDIT_ADD_LINK_TEMPLATE,{addOption:r[y]})),i.join(Bt)},_createEditOption:function(e,r){var s=this,o=s.getStrings();return n.sub(s.EDIT_OPTION_ROW_TEMPLATE,{remove:o[dt],titleName:i.html(o[t]),titleValue:i.html(o[At]),valueName:i.html(e),valueValue:i.html(r)})},_defInitEditFn:function(t){var n=this,r=e.Node.create(n.EDIT_TEMPLATE);r.delegate("click",e.bind(n._onEditLinkClickEvent,n),Ht+Kt),r.delegate("keydown",e.bind(n._onEditKeyEvent,n),Y),n.editContainer=r,n.setStdModContent(d.BODY,r.hide(),d.AFTER),n.editSortable=(new e.Sortable({container:r,handles:[Ht+zt],nodes:Ht+Qt,opacity:".3"})).delegate.dd.plug(e.Plugin.DDConstrained,{constrain:r,stickY:!0}),n._syncEditOptionsUI()},_getSelectedOptions:function(){var t=this,n=[];return t.options.each(function(e){e.get(t.get(Et))&&n.push(e)}),e.all(n)},_onEditEvent:function(e){var t=this;t._handleInitEditEvent(),t.toggleEdit(),t._syncEditOptionsUI()},_onEditLinkClickEvent:function(e){var t=this,n=e.currentTarget;n.test(Ht+Ut)?t.addNewOption():n.test(Ht+Xt)?t.toggleEdit():n.test(Ht+Wt)&&t.removeOption(n.ancestor(Ht+Qt)),e.halt()},_onEditKeyEvent:function(e){var t=this,n=e.currentTarget;if(e.isKey(gt)){var r=n.next(Y);r?r.selectText():t.addNewOption(),e.halt()}},_onSave:function(e){var t=this;t.saveOptions()},_setOptions:function(e){var t={};return s(e)?r.each(e,function(e){t[e]=e}):a(e)&&(t=e),t},_syncEditOptionsUI:function(){var e=this;e.editContainer.setContent(e._createEditBuffer())},_uiSetOptions:function(e){var t=this;t._createOptions(e),t._uiSetValue(t.get(At)),t._syncElementsName()},_uiSetValue:function(e){var t=this,o=t.options;return o&&o.size()&&(o.set(t.get(Et),!1),l(e)&&(s(e)||(e=String(e).split(Pt)),r.each(e,function(e){o.filter('[value="'+i.html(n.trim(e))+'"]').set(t.get(Et),!0)}))),e}}});e.BaseOptionsCellEditor=on;var un=e.Component.create({NAME:Nt,EXTENDS:e.BaseCellEditor,prototype:{ELEMENT_TEMPLATE:'<input autocomplete="off" class="'+Gt+'" type="text" />'}});e.TextCellEditor=un;var an=e.Component.create({NAME:Tt,EXTENDS:e.BaseCellEditor,prototype:{ELEMENT_TEMPLATE:'<textarea class="'+Gt+'"></textarea>'}});e.TextAreaCellEditor=an;var fn=e.Component.create({NAME:B,ATTRS:{multiple:{value:!1,validator:o}},EXTENDS:e.BaseOptionsCellEditor,UI_ATTRS:[it],prototype:{ELEMENT_TEMPLATE:'<select class="'+Gt+'"></select>',OPTION_TEMPLATE:'<option value="{value}">{label}</option>',getElementsValue:function(){var e=this;return e.get(it)?e._getSelectedOptions().get(
At):e.elements.get(At)},_syncElementsFocus:function(){var e=this;e.elements.focus()},_uiSetMultiple:function(e){var t=this,n=t.elements;e?n.setAttribute(it,it):n.removeAttribute(it)}}});e.DropDownCellEditor=fn;var ln=e.Component.create({NAME:N,ATTRS:{selectedAttrName:{value:C}},EXTENDS:e.BaseOptionsCellEditor,prototype:{ELEMENT_TEMPLATE:'<div class="'+Gt+'"></div>',OPTION_TEMPLATE:'<input class="'+Yt+'" id="{id}" name="{name}" type="checkbox" value="{value}"/>',OPTION_WRAPPER:'<label class="checkbox" for="{id}"> {label}</label>',getElementsValue:function(){var e=this;return e._getSelectedOptions().get(At)},_syncElementsFocus:function(){var e=this,t=e.options;t&&t.size()&&t.item(0).focus()},_syncElementsName:function(){var e=this,n=e.options;n&&n.setAttribute(t,e.get(z))}}});e.CheckboxCellEditor=ln;var cn=e.Component.create({NAME:ct,EXTENDS:e.CheckboxCellEditor,prototype:{OPTION_TEMPLATE:'<input class="field-input-choice" id="{id}" name="{name}" type="radio" value="{value}"/>',OPTION_WRAPPER:'<label class="radio" for="{id}"> {label}</label>',getElementsValue:function(){var e=this;return e._getSelectedOptions().get(At)[0]}}});e.RadioCellEditor=cn;var hn=e.Component.create({NAME:M,EXTENDS:e.BaseCellEditor,ATTRS:{bodyContent:{value:Bt},calendar:{setter:"_setCalendar",validator:a,value:null},dateFormat:{value:"%Y-%m-%d",validator:f},inputFormatter:{value:function(e){var t=this,n=[];return r.each(e,function(e,r){n.push(t.formatDate(e).toString())}),n}},outputFormatter:{value:function(e){var t=this,n=[];return r.each(e,function(e,r){n.push(h.Date.parse(t.get("dateFormat"),e))}),n}}},prototype:{ELEMENT_TEMPLATE:'<input class="'+Gt+'" type="hidden" />',initializer:function(){var t=this;t.after("calendar:dateClick",e.bind(t._afterDateSelect,t))},getElementsValue:function(){var e=this;return e.calendar.get("selectedDates")},formatDate:function(e){var t=this,n=t.get("dateFormat"),r=t.get("locale");return h.Date.format(e,{format:n,locale:r})},_afterDateSelect:function(e){var t=this,n=t.calendar.get("selectedDates");t.elements.val(r.invoke(n,"getTime").join(Pt))},_afterRender:function(){var t=this;e.DateCellEditor.superclass._afterRender.apply(t,arguments),t.calendar=(new e.Calendar(t.get(E))).render(t.bodyNode)},_setCalendar:function(t){var n=this;return e.merge({bubbleTargets:n},t)},_uiSetValue:function(e){var t=this,n=t.calendar,r;n&&(s(e)||(e=[e]),r=t.formatValue(t.get(ft),e),n._clearSelection(),r[0]?(n.set("date",r[0]),n.selectDates(r)):n.set("date",new Date))}}});e.DateCellEditor=hn},"2.0.0",{requires:["datatable-base","calendar","escape","overlay","sortable","aui-datatype","aui-toolbar","aui-form-validator","aui-datatable-core"],skinnable:!0});