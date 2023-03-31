import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-ver-denuncias')
export class VistaVerDenuncias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabecera" style="width: 100%; height: 8%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; justify-content: flex-end; width: 56%;">
   <h1 id="denunciasL">Denuncias</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="flex-grow: 0; justify-content: flex-end; width: 40%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="align-self: center;">
    <label id="filtrarL">Filtrar</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
    <vaadin-select value="Item one" id="filtro" style="align-self: center;">
     <template>
      <vaadin-list-box id="vaadinListBox" selected="0">
       <vaadin-item id="todas" selected>
        Todas
       </vaadin-item>
       <vaadin-item id="pendientes">
        Pendientes
       </vaadin-item>
       <vaadin-item id="aplicadas">
        Aplicadas
       </vaadin-item>
       <vaadin-item id="finalizadas">
        Finalizadas
       </vaadin-item>
      </vaadin-list-box>
     </template>
    </vaadin-select>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaDenuncias" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
