import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-denunciar-comentario-comercial')
export class VistaDenunciarComentarioComercial extends LitElement {
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
<vaadin-vertical-layout style="flex-wrap: wrap; height: 100%; width: 100%; justify-content: center; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 50%; height: 80%; flex-wrap: wrap;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-wrap: wrap; align-self: center;">
   <h1 id="denunciarL">Denunciar comentario</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 15%; flex-grow: 0;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="flex-grow: 0; width: 40%; justify-content: flex-end; flex-direction: row; align-items: center; flex-wrap: wrap;">
    <label id="motivol" style="width: 50%;">Elija el motivo de su denuncia</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="flex-grow: 0; align-self: center; justify-content: center; width: 50%;">
    <vaadin-select value="Item one" id="combo">
     <template>
      <vaadin-list-box id="vaadinListBox" selected="0">
       <vaadin-item id="noMeGustaItem" selected>
        No me gusta
       </vaadin-item>
       <vaadin-item id="spamItem">
        Spam
       </vaadin-item>
       <vaadin-item id="ofensivoItem">
        Contenido ofensivo
       </vaadin-item>
       <vaadin-item id="explicitoItem">
        Contenido sexxual
       </vaadin-item>
      </vaadin-list-box>
     </template>
    </vaadin-select>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; height: 30%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 40%; justify-content: flex-end; align-items: center; flex-wrap: wrap; height: 100%;" id="vaadinHorizontalLayout5">
    <label style="width: 40%; flex-grow: 0; flex-shrink: 1;" id="expliqueL">Explique los motivos de su denuncia</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6" style="flex-grow: 0; width: 70%;">
    <vaadin-text-area id="motivoTA" style="flex-grow: 0; width: 80%;"></vaadin-text-area>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7" style="width: 100%; align-self: center; justify-content: center; height: 20%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout8" style="align-self: center;">
    <vaadin-button id="cancelarB">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout9" style="align-self: center;">
    <vaadin-button id="EnviarB">
     Enviar
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
