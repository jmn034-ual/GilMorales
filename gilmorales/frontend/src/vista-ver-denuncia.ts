import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-denuncia')
export class VistaVerDenuncia extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout style="z-index: 11; align-items: flex-start; border-radius: 10px; padding: var(--lumo-space-m); border-radius: 18px; border: 2px solid #F5F5F5; background-color: white;" id="vaadinVerticalLayout1">
  <vaadin-button id="botonVer" style="align-self: flex-end;" theme="primary success">
   Ver
  </vaadin-button>
  <hr id="hr" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
   <label id="label" style="color: black; font-weight: bold;">ID:</label>
   <label id="idDenuncia">idDenuncia</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <label id="label1" style="color: black; font-weight: bold;">Tipo:</label>
   <label id="tipo">tipo denuncia</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
   <label id="label2" style="color: black;
font-weight: bold;
">Nombre:</label>
   <label id="nombreUsuario">Nombre Usuario</label>
  </vaadin-horizontal-layout>
  <label id="label3" style="color: black; font-weight: bold;">Motivo:</label>
  <label id="motivo">Motivo de la denuncia</label>
  <label id="label4" style="color: black;
font-weight: bold;
">Explicación:</label>
  <label id="explicacion">La explicacion de la denuncia</label>
  <vaadin-vertical-layout theme="spacing" id="estado" style="padding: 0px;">
   <label id="label5" style="color: black; font-weight: bold; align-self: flex-start;">Estado:</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <hr id="hr1" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
  <vaadin-button id="cancelar" theme="error">
   Cancelar
  </vaadin-button>
  <vaadin-button id="guardar" theme="primary">
   Guardar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
