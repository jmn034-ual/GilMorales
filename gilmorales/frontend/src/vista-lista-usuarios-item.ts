import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="z-index: 11; background-color: #423F3F; width: 600px; align-items: center;">
 <vaadin-vertical-layout id="layoutPublicacion" style="align-items: center; width: 70%; align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="labelInformacion" style="flex-grow: 0; flex-shrink: 0; z-index: 12; width: 30%; align-self: center;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
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
