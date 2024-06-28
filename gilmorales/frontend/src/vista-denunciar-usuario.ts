import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
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
<vaadin-vertical-layout id="layoutDenunciarUsuario" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 100%;">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; margin: var(--lumo-space-m);">
  <h1 id="titulo">Denunciar Usuario</h1>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 50%;" theme="spacing-xs">
  <h4 id="tituloNombre" style="margin: 0px;">Motivo:</h4>
  <vaadin-text-field label="" placeholder="Motivo de la denuncia..." id="textFieldNombreusuario" style="align-self: flex-start; flex-grow: 0; width: 100%; flex-shrink: 0;"></vaadin-text-field>
  <h4 id="tituloMotivo" style="margin: 0px;">Motivos de la denuncia:</h4>
  <vaadin-text-area label="" placeholder="Add detailed explanation" id="textAreaMotivoDenuncia" style="flex-grow: 0; align-self: stretch; flex-shrink: 0;"></vaadin-text-area>
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
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
