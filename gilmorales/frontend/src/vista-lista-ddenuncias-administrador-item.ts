import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista-ddenuncias-administrador-item')
export class VistaListaDdenunciasAdministradorItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="z-index: 11;  align-items: center;" id="vaadinHorizontalLayout">
 <vaadin-avatar id="vaadinAvatar" style="align-items: center; width: 150px; align-self: center; height: 150px;"></vaadin-avatar>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 0; flex-shrink: 0; z-index: 12; width: 30%; align-self: center;">
  <vaadin-button theme="tertiary" id="nombreUsuario" style="flex-shrink: 0;">
    NombreDeUsuario 
  </vaadin-button>
  <label id="nombreCompleto">Nombre completo de usuario</label>
  <label id="estadoDenuncia">Estado denuncia</label>
  <label id="motivoDenuncia">Motivo de la denuncia</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
