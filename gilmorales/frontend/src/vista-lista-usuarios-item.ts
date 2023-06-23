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
<vaadin-horizontal-layout id="vaadinHorizontalLayout">
 <vaadin-vertical-layout id="layoutPublicacion" style="flex-shrink: 1; padding: 0%; align-items: flex-end;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="labelInformacion" style="flex-grow: 1; flex-shrink: 0; align-items: flex-start;">
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
