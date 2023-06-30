import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-denunciar-usuario')
export class VistaDenunciarUsuario extends LitElement {
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
 <vaadin-vertical-layout id="layoutDenunciarUsuario" style="align-self: stretch; flex-grow: 1;">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; margin: var(--lumo-space-m);">
   <h1 id="titulo">Denunciar Usuario</h1>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: center; width: 70%; flex-grow: 1;">
   <vaadin-horizontal-layout theme="spacing" id="layoutNombre" style="align-self: stretch;">
    <h4 id="tituloNombre">Nombre: </h4>
    <vaadin-text-field label="" placeholder="NombreDelusuario" id="textFieldNombreusuario" style="align-self: center; flex-grow: 1; margin: var(--lumo-space-m);"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; flex-grow: 0; height: 60%;" id="layoutMotivo">
    <h4 id="tituloMotivo">Motivos de la denuncia:</h4>
    <vaadin-text-area label="" placeholder="Add detailed explanation" id="textAreaMotivoDenuncia" style="flex-grow: 1; align-self: stretch; margin: var(--lumo-space-m);"></vaadin-text-area>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="align-self: stretch; justify-content: center;">
    <vaadin-button id="botonCancelar">
      Cancelar 
    </vaadin-button>
    <vaadin-button id="botonEnviar">
      Enviar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
