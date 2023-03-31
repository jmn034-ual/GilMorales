import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-usuarios-item')
export class VistaListaUsuariosItem extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" id="layoutPublicacion"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="labelInformacion" style="flex-grow: 0;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" id="layoutFotoperfil"></vaadin-vertical-layout>
   <vaadin-button theme="tertiary" id="botonNombreUsuario">
    NombreUsuario
   </vaadin-button>
  </vaadin-horizontal-layout>
  <label id="labelNombreCompleto">Nombre Completo Usuario</label>
  <label id="labelDescripcion">Descripción corta</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
